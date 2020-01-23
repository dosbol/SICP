(ns sicp-clojure.1-07)

(defn square [x]
  (* x x))

(defn good-enough? [guess x]
  (-> guess
      square
      (- x)
      Math/abs
      (< 0.001)))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (recur (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(defn alt-good-enough? [prev-guess guess]
  (< (Math/abs (- prev-guess guess)) 0.001))

(defn alt-sqrt-iter [prev-guess guess x]
  (if (alt-good-enough? prev-guess guess)
    guess
    (recur guess (improve guess x) x)))

(defn alt-sqrt [x]
  (alt-sqrt-iter 0 1.0 x))
