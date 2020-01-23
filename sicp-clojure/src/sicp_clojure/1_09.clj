(ns sicp-clojure.1-09)

(defn sum-recursive [a b]
  (if (= a 0)
    b
    (inc (sum-recursive (dec a) b))))

(defn sum-iterative [a b]
  (if (= a 0)
    b
    (sum-iterative (dec a) (inc b))))
