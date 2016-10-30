(def version "0.8.0")

(task-options!
 pom {:project     'fw1/boot-template
      :version     version
      :description "FW/1 template for Boot new"
      :url         "https://github.com/framework-one/fw1-template/"
      :scm         {:url "https://github.com/framework-one/fw1-template/"}
      :license     {"Eclipse Public License"
                    "http://www.eclipse.org/legal/epl-v10.html"}})

(set-env! :resource-paths #{"src"}
          :dependencies   '[[org.clojure/clojure   "RELEASE"]
                            [seancorfield/boot-new "RELEASE"]])

(deftask build []
  (comp (pom) (jar) (install)))

(deftask deploy []
  (comp (pom) (jar) (push)))
