(ns {{name}}.controllers.main
  (:require [framework.one :as fw1]))

(defn default "/main/default handler" [rc]
  rc)

(comment
  ;; If you decide to use the Enlive template engine, you will need to
  ;; implement default-view, default-layout, and/or layout node
  ;; transforms for which the skeletons are in this comment. You will
  ;; also need to add a <div id="body"/> tag in place of {{body}} in
  ;; layouts/main/default.html.
  ;;
  ;; If you continue to use the Selmer template engine, you can simply
  ;; delete this comment altogether.
  
  (defn default-view "/main/default view render" [rc nodes]
    nodes)
  
  (defn default-layout "/main/default layout render" [rc nodes]
    nodes)
  
  (defn layout "/main section layout render" [rc nodes]
    nodes))
