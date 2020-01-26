(ns sicp-clojure.1-17-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-17 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 10 (solutions/fast-mult 1 10)))
    (is (= 20 (solutions/fast-mult 2 10)))
    (is (= 0 (solutions/fast-mult 0 11)))
    (is (= 300 (solutions/fast-mult 25 12)))
    (is (= 100 (solutions/fast-mult 10 10)))
    (is (= 12221 (solutions/fast-mult 1111 11)))))
