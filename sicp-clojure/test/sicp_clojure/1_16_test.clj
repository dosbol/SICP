(ns sicp-clojure.1-16-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-16 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 1 (solutions/fast-expt 1 10)))
    (is (= 1024 (solutions/fast-expt 2 10)))
    (is (= 2048 (solutions/fast-expt 2 11)))
    (is (= 4096 (solutions/fast-expt 2 12)))
    (is (= 10000000000 (solutions/fast-expt 10 10)))
    (is (= 100000000000 (solutions/fast-expt 10 11)))))
