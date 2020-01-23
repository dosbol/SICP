(ns sicp-clojure.1-08-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-08 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (> 0.001 (Math/abs (- 2 (solutions/square-cube 8)))))
    (is (> 0.001 (Math/abs (- 3 (solutions/square-cube 27)))))))
