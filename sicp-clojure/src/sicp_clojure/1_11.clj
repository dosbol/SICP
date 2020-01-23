(ns sicp-clojure.1-11)

(defn f-recursive [n]
  (if (< n 3)
    n
    (+ (f-recursive (- n 1))
       (* 2 (f-recursive (- n 2)))
       (* 3 (f-recursive (- n 3))))))

(defn f-iterative [n]
  (let [iter (fn [count f-n-1 f-n-2 f-n-3]
               (let [f-n (+ f-n-1 (* 2 f-n-2) (* 3 f-n-3))]
                 (if (= count n)
                   f-n
                   (recur (inc count) f-n f-n-1 f-n-2))))]
    (if (< n 3)
      n
      (iter 3 2 1 0))))
