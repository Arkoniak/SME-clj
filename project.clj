(defproject sme-clj "1.0.0-SNAPSHOT"
  :description "Structure-Mapping Engine implementation in Clojure."
  :url "http://example.com/FIXME"
  ;:dependencies [[org.clojure/clojure "1.2.0"]
  ;               [org.clojure/clojure-contrib "1.2.0"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.combinatorics "0.1.3"]]
  ; :dependencies [[org.clojure/clojure "1.8.0"]
  ;                [org.clojure/clojure-contrib "1.8.0"]]
  ;:dev-dependencies [[swank-clojure "1.2.1"]]
  :main ^:skip-aot sme-clj.example.simple-heat-water
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
