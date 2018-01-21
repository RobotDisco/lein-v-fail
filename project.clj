(defproject lein-v-fail "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot lein-v-fail.core
  :plugins [[com.roomkey/lein-v "6.2.0"]]
  :source-paths ["src/clj"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :prep-tasks [["v" "cache" "src/clj"]])
