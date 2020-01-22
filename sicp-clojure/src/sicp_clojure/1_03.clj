(ns sicp-clojure.1-03)

(defn square [x]
  (* x x))

(defn sum-of-square [x y]
  (+ (square x) (square y)))

(defn sum-of-square-of-two-larger [a b c]
  (cond
    (and (<= c a) (<= c b)) (sum-of-square a b)
    (and (<= b a) (<= b c)) (sum-of-square a c)
    :else (sum-of-square b c)))
