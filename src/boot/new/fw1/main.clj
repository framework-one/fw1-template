(ns {{name}}.main
  (:require [framework.one :as fw1]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn start
  "Entry point from Boot file, also called by -main."
  [port config-map]
  (let [port (or port (System/getenv "PORT") 8080)
        port (cond-> port (string? port) Integer/parseInt)]
    (run-jetty (fw1/start (merge {:application-key "{{name}}"} config-map))
               {:port port})))

(defn -main
  "Entry point from uberjar etc. Customize as you wish!
  By default, only uses PORT environment variable, not arguments,
  to determine the port on which to run."
  [& args]
  (start nil {}))
