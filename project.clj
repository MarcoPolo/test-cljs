(defproject test-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1889"] ]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild
              {:builds
               [{:id "advanced"
                 :source-paths ["src/test_cljs"]
                 :compiler {:optimizations :advanced
                            :pretty-print false
                            :output-to "main.js"
                            :source-map "main.js.map"
                            }}]})
