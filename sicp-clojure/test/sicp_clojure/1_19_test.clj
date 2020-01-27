(ns sicp-clojure.1-19-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-19 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 0 (solutions/fib 0)))
    (is (= 1 (solutions/fib 1)))
    (is (= 1 (solutions/fib 2)))
    (is (= 2 (solutions/fib 3)))
    (is (= 3 (solutions/fib 4)))
    (is (= 5 (solutions/fib 5)))
    (is (= 8 (solutions/fib 6)))
    (is (= 13 (solutions/fib 7)))
    (is (= 21 (solutions/fib 8)))
    (is (= 34 (solutions/fib 9)))
    (is (= 55 (solutions/fib 10)))))
