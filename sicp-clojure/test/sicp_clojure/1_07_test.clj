(ns sicp-clojure.1-07-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-07 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (> 0.001 (Math/abs (- 3 (solutions/sqrt 9)))))
    (is (> 0.001 (Math/abs (- 5 (solutions/sqrt 25))))))
  (testing "alt-sqrt is better"
    (is (>= (Math/abs (- 3 (solutions/sqrt 9)))
            (Math/abs (- 3 (solutions/alt-sqrt 9)))))
    (is (>= (Math/abs (- 5 (solutions/sqrt 25)))
            (Math/abs (- 5 (solutions/alt-sqrt 25)))))))
