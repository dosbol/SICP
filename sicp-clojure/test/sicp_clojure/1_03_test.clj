(ns sicp-clojure.1-03-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-03 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 13 (solutions/sum-of-square-of-two-larger 1 2 3)))
    (is (= 13 (solutions/sum-of-square-of-two-larger 3 1 2)))
    (is (= 13 (solutions/sum-of-square-of-two-larger 1 3 2)))
    (is (= 13 (solutions/sum-of-square-of-two-larger 2 1 3)))
    (is (= 5 (solutions/sum-of-square-of-two-larger -1 -2 -3)))
    (is (= 25 (solutions/sum-of-square-of-two-larger 2 3 4)))
    (is (= 2 (solutions/sum-of-square-of-two-larger 1 1 1)))
    (is (= 5 (solutions/sum-of-square-of-two-larger 1 1 2)))))
