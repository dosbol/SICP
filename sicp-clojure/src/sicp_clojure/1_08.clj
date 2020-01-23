(ns sicp-clojure.1-08)

(defn square [x]
  (* x x))

(defn cube [x]
  (* x (square x)))

(defn good-enough? [guess x]
  (-> guess
      cube
      (- x)
      Math/abs
      (< 0.001)))

(defn improve [guess x]
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(defn square-cube-iter [guess x]
  (if (good-enough? guess x)
    guess
    (recur (improve guess x) x)))

(defn square-cube [x]
  (square-cube-iter 1.0 x))
