(ns sicp-clojure.1-10-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-10 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 1024 (solutions/A 1 10)))
    (is (= 65536 (solutions/A 2 4)))
    (is (= 65536 (solutions/A 3 3)))))
