(ns leiningen.new.fw1
    (:use leiningen.new.templates :only [renderer name-to-path ->files]))

(def render (renderer "fw1"))

(defn fw1
  "A FW/1 web application template"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/{{sanitized}}/main.clj" (render "main.clj" data)]
             ["src/{{sanitized}}/controllers/main.clj" (render "controller.clj" data)]
             ["src/{{sanitized}}/layouts/main/default.html" (render "layout.html" data)]
             ["src/{{sanitized}}/views/main/default.html" (render "view.html" data)]
             ["src/{{sanitized}}/assets/css/main.css" (render "main.css" data)]
             "src/{{sanitized}}/assets/js"
             "src/{{sanitized}}/assets/img")))
