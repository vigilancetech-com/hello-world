(ns hello-world.core
  (:require [com.rpl.specter :as sp ]))

(defn foo [] (sp/setval [ALL END] [:a :b] [[1] '(1 2) [:c]]))

(println "Hello world!")
