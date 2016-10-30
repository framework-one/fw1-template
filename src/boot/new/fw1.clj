(ns boot.new.fw1
    (:require [boot.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "fw1"))

(defn fw1
  "A FW/1 web application template"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :body "{{body}}"
              :version "{{version}}"}]
    (->files data
             ["README.md" (render "README.md" data)]
             ["build.boot" (render "build.boot" data)]
             [".gitignore" (render "gitignore" data)]
             ["src/{{sanitized}}/main.clj" (render "main.clj" data)]
             ["src/{{sanitized}}/controllers/main.clj" (render "controller.clj" data)]
             ["src/{{sanitized}}/layouts/main/default.html" (render "layout.html" data)]
             ["src/{{sanitized}}/views/main/default.html" (render "view.html" data)]
             ["resources/public/assets/css/main.css" (render "main.css" data)]
             "resources/public/assets/js"
             "resources/public/assets/img")))
