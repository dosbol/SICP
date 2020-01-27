(ns sicp-clojure.1-19)

(defn square [x]
  (* x x))

(defn fib-iter [a b p q count]
  (cond
    (zero? count) b
    (even? count) (fib-iter a
                            b
                            (+ (square p) (square q))
                            (+ (* 2 p q) (square q))
                            (/ count 2))
    :else (fib-iter (+ (* b q) (* a q) (* a p))
                    (+ (* b p) (* a q))
                    p
                    q
                    (- count 1))))

(defn fib [n]
  (fib-iter 1 0 0 1 n))
