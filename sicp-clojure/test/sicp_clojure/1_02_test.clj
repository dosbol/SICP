(ns sicp-clojure.1-02-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-02 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= -37/150 solutions/result))))
