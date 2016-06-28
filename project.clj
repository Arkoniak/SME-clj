(defproject sme-clj "1.0.0-SNAPSHOT"
  :description "Structure-Mapping Engine implementation in Clojure."
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.combinatorics "0.1.3"]]
  :main ^:skip-aot sme-clj.example.simple-heat-water
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
