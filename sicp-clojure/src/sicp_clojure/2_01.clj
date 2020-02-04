(ns sicp-clojure.2-01)

(defn gcd [a b]
  (loop [a (Math/abs a)
         b (Math/abs b)]
    (if (zero? b)
      a
      (recur b (mod a b)))))

(defn make-rat [x y]
  (let [g (gcd x y)
        denom (-> y (/ g) Math/abs)
        ; numer (-> x (/ g) (* (/ y (* denom g))))
        numer (-> x (/ g) (#(if (neg? y) (- %) %)))]
    (cons numer (list denom))))

(defn numer [x]
  (first x))

(defn denom [x]
  (second x))

(defn str-rat [x]
  (str (numer x) "/" (denom x)))
