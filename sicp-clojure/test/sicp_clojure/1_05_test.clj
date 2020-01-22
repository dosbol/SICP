(ns sicp-clojure.1-05-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.1-05 :as solutions]))

(def test-future (future (solutions/test-fn 0 (solutions/p))))

(defn fixture [f]
  (f)
  (future-cancel test-future))

(use-fixtures :once fixture)

(deftest interpreter-test
  (testing "results"
    (is (= :timeout (deref test-future 1000 :timeout)))))
