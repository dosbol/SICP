(ns sicp-clojure.1-15)

(defn cube [x]
  (* x x x))

(defn p [x]
  (- (* 3 x) (* 4 (cube x))))

(defn sine [angle]
  (if (<= (Math/abs angle) 0.1)
    angle
    (p (sine (/ angle 3.0)))))
