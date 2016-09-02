(ns bowling.core
  (:gen-class))

(defn start-game [game]
  (let [game []]
  game))

(defn roll [game pins]
  (conj game pins))

(defn strike? [frame]
  (= 10 frame))

(defn spare? [frame-one frame-two]
  (= 10 (+ frame-one frame-two)))

(defn score [game]
  (loop [points 0 acc game frame 0]
    (cond
      (= 10 frame)
        points
      (strike? (first acc))
        (recur (+ points 10 (second acc) (nth acc 2))
               (rest acc)
               (inc frame))
      (spare? (first acc) (second acc))
        (recur (+ points 10 (nth acc 2))
               (nthrest acc 2)
               (inc frame))
      :else
        (recur (+ points (first acc) (second acc))
               (nthrest acc 2)
               (inc frame)))))
