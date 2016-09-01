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
  (loop [points 0 acc game]
    (if (= 0 (count acc))
      points
      (cond 
        (strike? (first acc))
          (recur (+ points 10 (second acc) (nth acc 2))
                 (rest acc))
        (spare? (first acc) (second acc))
          (recur (+ points 10 (nth acc 2))
                 (nthrest acc 2))
        :else 
          (recur (+ points (first acc) (second acc))
                 (nthrest acc 2))))))

