(ns sicp-clojure.1-04-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-04 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 3 (solutions/a-plus-abs-b 1 2)))
    (is (= 3 (solutions/a-plus-abs-b 1 -2)))
    (is (= 1 (solutions/a-plus-abs-b -1 -2)))))
