(defproject clj-rackspace "0.2.0-SNAPSHOT"
  :description "Pure Clojure language bindings for the Rackspace Cloud"
  :url "https://github.com/oubiwann/clj-rackspace"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/core.incubator "0.1.3"]
                 [org.clojure/data.json "0.2.3"]
                 [clj-http "0.7.7"]]
  :repositories [["releases" {:url "https://clojars.org/repo"
                              :creds :gpg}]]
  :repl-options {
    :init-ns rackspace.api}
  :profiles {
    :dev {
      :dependencies [[org.clojure/tools.namespace "0.2.3"]
                     [org.clojure/java.classpath "0.2.0"]]}
    :testing {
      :dependencies [[ring-mock "0.1.5"]
                     [clj-http-fake "0.4.1"]
                     [midje "1.5.1"]
                     [leiningen "2.3.3"]]}})
