(ns sicp-clojure.1-17)

(defn double [x]
  (* x 2))

(defn halve [x]
  (/ x 2))

(defn fast-mult [a b]
  (cond (= a 0) 0
        (even? a) (double (fast-mult (halve a) b))
        :else (+ b (fast-mult (- a 1) b))))
