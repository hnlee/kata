(ns bowling.core)

(defn roll 
  "Add rolls to existing game or start new game with first roll"
  ([game & pins] (apply conj game pins))
  ([pins] [pins]))
  
(defn strike? [rolls]
  (= 10 (first rolls)))

(defn spare? [rolls]
  (= 10 (+ (first rolls) (second rolls))))

(defn score [game]
  (loop [points 0 rolls game frame 0]
    (cond 
      (= 10 frame) points
      (strike? rolls) (recur 
        (apply + points (take 3 rolls))
        (rest rolls)
        (inc frame))
      (spare? rolls) (recur 
        (apply + points (take 3 rolls)) 
        (nthrest rolls 2)
        (inc frame))
      :else (recur 
        (apply + points (take 2 rolls)) 
        (nthrest rolls 2)
        (inc frame)))))
