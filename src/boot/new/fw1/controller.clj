(ns {{name}}.controllers.main
  (:require [framework.one :as fw1]))

(defn before
  "Run before each controller here."
  [rc]
  rc)

(defn after
  "Run after each controller here."
  [rc]
  (assoc rc :version (-> rc (fw1/event :config) :version)))

(defn default
  "/main/default handler"
  [rc]
  rc)
