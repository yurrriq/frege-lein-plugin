(defproject example "0.1.0-SNAPSHOT"
  :description "Example Clojure / Frege mixed language application"
  :url "http://example.com/FIXME"
  :license {:name "BSD 3-clause"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 ;; need to depend on Frege for runtime:
                 [org.frege-lang/frege "3.24.100.1"]]
  :plugins [[org.clojars.yurriq/lein-fregec "3.24.100.1"]]
  :frege-source-paths ["src/frege"]
  :main example.core
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
