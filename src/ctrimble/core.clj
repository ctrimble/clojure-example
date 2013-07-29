(ns ctrimble.core
  (:require [liberator.core :refer [resource defresource]]
            [ring.adapter.jetty :refer [run-jetty]]      
            [compojure.core :refer [defroutes ANY]])
  (:gen-class))

(defroutes app
  (ANY "/" [] (resource :available-media-types ["text/html"]
                           :handle-ok "<html>Hello, Internet.</html>")))

(defn -main [& args]
  (run-jetty #'app {:port 3000})
)
