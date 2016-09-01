(ns bowling.core
  (:gen-class))

(defn start-game [game]
  (let [game []]
  game))

(defn roll [game pins]
  (conj game pins))
  
(defn score [game]
  (reduce
    (fn [x, y] (+ x y))
    game)) 
