(ns sicp-clojure.1-05)

(defn p []
  (recur))

(defn test-fn [x y]
  (if (zero? x)
    0
    y))
