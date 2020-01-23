(ns sicp-clojure.1-11-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-11 :as solutions]))

(deftest interpreter-test
  (testing "recursive"
    (is (= 0 (solutions/f-recursive 0)))
    (is (= 1 (solutions/f-recursive 1)))
    (is (= 2 (solutions/f-recursive 2)))
    (is (= 4 (solutions/f-recursive 3)))
    (is (= 11 (solutions/f-recursive 4)))
    (is (= 25 (solutions/f-recursive 5)))
    (is (= 59 (solutions/f-recursive 6))))
  (testing "iterative"
    (is (= 0 (solutions/f-iterative 0)))
    (is (= 1 (solutions/f-iterative 1)))
    (is (= 2 (solutions/f-iterative 2)))
    (is (= 4 (solutions/f-iterative 3)))
    (is (= 11 (solutions/f-iterative 4)))
    (is (= 25 (solutions/f-iterative 5)))
    (is (= 59 (solutions/f-iterative 6)))))
