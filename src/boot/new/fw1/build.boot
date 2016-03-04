(def version "0.1.0-SNAPSHOT")

(task-options!
 aot {:namespace   #{'{{name}}.main}}
 pom {:project     '{{name}}
      :version     version
      :description "FIXME: write this!"}
 jar {:main        '{{name}}.main
      :file        (str "{{name}}-" version "-standalone.jar")})

(set-env! :resource-paths #{"src"}
          :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [framework-one       "RELEASE"]])

(deftask build []
  (comp (aot) (pom) (uber) (jar) (target :dir #{"target"})))

(deftask run
  [a args ARG [str] "the arguments for the application."]
  (require '[{{name}}.main :as app])
  (apply (resolve 'app/-main) args))
