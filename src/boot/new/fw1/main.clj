(ns {{name}}.main
  (:require [framework.one :as fw1]
            [com.stuartsierra.component :as component])
  (:gen-class))

;; Implement your application's start/stop lifecycle here:
;; See https://github.com/stuartsierra/component
(defrecord Application [config]
  component/Lifecycle
  (start [this]
    this)
  (stop  [this]
    this))

(defn my-application
  "Return your application component, fully configured.
  We use just a single component here -- Application -- but if you have
  subcomponents, you could use system-map here."
  [application-config]
  (map->Application {:config application-config}))

(defn my-handler
  "Given the application component, return a Ring handler.
  This is where you configure FW/1 itself."
  [application]
  (fw1/default-handler application
                       {:application-key "{{name}}"
                        :home            "main.default"}))

(defn new-system
  "Build a default system to run. In the REPL:

  (def system (new-system 8888))
  ;; or
  (def system (new-system 8888 :http-kit))
  (alter-var-root #'system component/start)"
  ([port]        (new-system port :jetty {}))
  ([port server] (new-system port server {}))
  ([port server config-map]
   (component/system-map :application (my-application config-map)
                         :web-server  (fw1/web-server #'my-handler port server))))

(defn start
  "Entry point from Boot file, also called by -main."
  [port config-map]
  (let [port (or port (System/getenv "PORT") 8080)
        port (cond-> port (string? port) Integer/parseInt)
        server (or (:server config-map) "jetty")]
    (println "Starting" server "on port" port "...")
    (-> (component/start (new-system port (keyword server) config-map))
        ;; wait for the web server to shutdown
        :web-server :shutdown deref)))

(defn -main
  "Entry point from uberjar etc. Customize as you wish!
  By default, only uses PORT environment variable, not arguments,
  to determine the port on which to run."
  [& args]
  (start nil {}))
