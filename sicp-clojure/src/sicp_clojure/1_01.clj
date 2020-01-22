(ns sicp-clojure.1-01)

(def result-1 10)

(def result-2 (+ 5 3 4))

(def result-3 (- 9 1))

(def result-4 (/ 6 2))

(def result-5 (+ (* 2 4) (- 4 6)))

(def a 3)

(def b (+ a 1))

(def result-6 (+ a b (* a b)))

(def result-7 (= a b))

(def result-8 (if (and (> b a) (< b (* a b)))
                b
                a))

(def result-9 (cond
                (= a 4) 6
                (= b 4) (+ 6 7 a)
                :else 25))

(def result-10 (+ 2 (if (> b a) b a)))

(def result-11 (* (cond
                    (> a b) a
                    (< a b) b
                    :else -1)
                  (+ a 1)))
