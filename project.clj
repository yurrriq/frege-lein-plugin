(defproject lein-fregec "0.1.0-SNAPSHOT"
  :description "Leiningen plugin to compile Frege source code"
  :url "https://github.com/seancorfield/lein-fregec"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in :leiningen
  ;; the plugin depends on the Frege runtime in order to drive the
  ;; compiler, but the subprocess-profile used in the plugin also
  ;; has to manipulate the dependencies so make sure to keep this in sync!
  :dependencies [[com.theoryinpractise.frege/frege "3.21.586-g026e8d7"]])