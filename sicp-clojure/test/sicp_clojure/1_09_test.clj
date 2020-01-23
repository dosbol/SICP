(ns sicp-clojure.1-09-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-09 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 9 (solutions/sum-recursive 4 5)))
    (is (= 9 (solutions/sum-iterative 4 5)))))
