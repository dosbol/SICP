(ns sicp-clojure.1-01-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-01 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 10 solutions/result-1))
    (is (= 12 solutions/result-2))
    (is (= 8 solutions/result-3))
    (is (= 3 solutions/result-4))
    (is (= 6 solutions/result-5))
    (is (= 19 solutions/result-6))
    (is (= false solutions/result-7))
    (is (= 4 solutions/result-8))
    (is (= 16 solutions/result-9))
    (is (= 6 solutions/result-10))
    (is (= 16 solutions/result-11))))
