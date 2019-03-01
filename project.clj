(defproject starcity/toolbelt-re-frame "0.2.0-SNAPSHOT"
  :description "Utility functions and fx for working with re-frame."
  :url "https://github.com/starcity-properties/toolbelt-re-frame"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.516"]
                 [re-frame "0.10.6" :scope "provided"]
                 [reagent "0.8.1" :scope "provided"]
                 [starcity/toolbelt-core "0.3.0"]]
  :deploy-repositories [["releases" {:url   "https://clojars.org/repo"
                                     :creds :gpg}]])
