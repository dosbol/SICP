(ns sicp-clojure.1-12-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-12 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 1 (solutions/pascal 1 1)))
    (is (= 1 (solutions/pascal 2 1)))
    (is (= 1 (solutions/pascal 2 2)))
    (is (= 1 (solutions/pascal 3 1)))
    (is (= 2 (solutions/pascal 3 2)))
    (is (= 1 (solutions/pascal 3 3)))
    (is (= 1 (solutions/pascal 4 1)))
    (is (= 3 (solutions/pascal 4 2)))
    (is (= 3 (solutions/pascal 4 3)))
    (is (= 1 (solutions/pascal 4 4)))
    (is (= 1 (solutions/pascal 5 1)))
    (is (= 4 (solutions/pascal 5 2)))
    (is (= 6 (solutions/pascal 5 3)))
    (is (= 4 (solutions/pascal 5 4)))
    (is (= 1 (solutions/pascal 5 5)))))
