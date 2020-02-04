(ns sicp-clojure.2-01-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.2-01 :as solutions]))

(deftest interpreter-test
  (testing "results"
    (is (= 1 (solutions/numer (solutions/make-rat 1 2))))
    (is (= 1 (solutions/numer (solutions/make-rat 10 20))))    
    (is (= 2 (solutions/denom (solutions/make-rat 1 2))))
    (is (= 2 (solutions/denom (solutions/make-rat 10 20))))    
    (is (= -1 (solutions/numer (solutions/make-rat -1 2))))
    (is (= -1 (solutions/numer (solutions/make-rat 1 -2))))
    (is (= 2 (solutions/denom (solutions/make-rat 1 -2))))
    (is (= 1 (solutions/numer (solutions/make-rat -1 -2))))
    (is (= "1/2" (solutions/str-rat (solutions/make-rat 1 2))))
    (is (= "-1/2" (solutions/str-rat (solutions/make-rat -1 2))))
    (is (= "-1/2" (solutions/str-rat (solutions/make-rat 1 -2))))
    (is (= "1/2" (solutions/str-rat (solutions/make-rat -1 -2))))
    (is (= "1/2" (solutions/str-rat (solutions/make-rat 10 20))))))
