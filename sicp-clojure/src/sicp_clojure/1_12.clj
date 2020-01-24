(ns sicp-clojure.1-12)

(defn pascal [col row]
  (if (or (= row 1)
          (= col row))
    1
    (+ (pascal (dec col) row)
       (pascal (dec col) (dec row)))))
