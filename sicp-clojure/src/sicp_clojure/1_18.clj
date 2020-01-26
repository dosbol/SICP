(ns sicp-clojure.1-18)

(defn double [x]
  (* x 2))

(defn halve [x]
  (/ x 2))

(defn fast-mult-iter [a b n]
  (cond (= a 0) n
        (even? a) (fast-mult-iter (halve a) (double b) n)
        :else (fast-mult-iter (- a 1) b (+ n b))))

(defn fast-mult [a b]
  (fast-mult-iter a b 0))
