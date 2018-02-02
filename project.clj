(defproject starcity/toolbelt-re-frame "0.1.0-SNAPSHOT"
  :description "Utility functions and fx for working with re-frame."
  :url "https://github.com/starcity-properties/toolbelt-re-frame"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]
                 [re-frame "0.9.4" :scope "provided"]
                 [reagent "0.6.0" :scope "provided"]
                 [starcity/toolbelt-core "0.3.0"]]
  :deploy-repositories [["releases" {:url   "https://clojars.org/repo"
                                     :creds :gpg}]])
