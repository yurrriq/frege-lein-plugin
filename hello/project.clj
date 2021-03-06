(defproject frege-hello "0.1.0-SNAPSHOT"
  :description "Example standalone Frege application"
  :url "http://example.com/FIXME"
  :license {:name "BSD 3-clause"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [;; need to depend on Frege for uberjar:
                 [org.frege-lang/frege "3.24.100.1"]]
  :plugins [[org.clojars.yurriq/lein-fregec "3.24.100.1"]]
  :fregec-options ["-target" "1.7"]
  :profiles {:uberjar {:prep-tasks ["fregec"]}})
