(defproject org.cyverse/authy "3.0.0-SNAPSHOT"
  :description "An OAuth 2.0 client clibrary written in Clojure."
  :url "https://github.com/cyverse-de/authy"
  :license {:name "BSD Standard License"
            :url "http://www.iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[test2junit "1.2.2"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [clj-http "2.0.0"]
                 [slingshot "0.10.3"]])
