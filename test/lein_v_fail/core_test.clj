(ns lein-v-fail.core-test
  (:require [clojure.test :refer :all]
            [lein-v-fail.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
