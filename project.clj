(defproject clojure-example "0.1.0-SNAPSHOT"
  :description "An example clojure REST API"
  :url "http://github.com/ctrimble/clojure-example"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [liberator "0.9.0"]
                 [compojure "1.1.3"]
                 [ring/ring-jetty-adapter "1.1.0"]]
  :main ctrimble.core)
