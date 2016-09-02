(ns bowling.core
  ;; Why is :gen-class necessary?
  (:gen-class))

(defn start-game [game]
  ;; I'm confused here, the function is being passed a game, but then with the let
  ;; binding it's shadowing the game with an empty vector, why is something being passed
  ;; into this function if it's not used?

  ;; Additionally, start-game isn't being used anywhere and doesn't call anything and
  ;; it always returns an empty vector -- what is this function for?
  (let [game []]
    ;; Indentation
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
      ;; Conventionally cond has the check on the left and the action/value on the right
      (= 10 frame) points
      ;; Though this is a simple check, it would be nice to know why this is
      ;; checking on 10, a function called `game-over` or something similar,
      ;; passed the frame would make it easier for someone coming into the
      ;; project to grok what is happening (I don't know bowling so I had to guess)
      (strike? (first acc)) (recur (+ points 10 (second acc) (nth acc 2))
                                   (rest acc)
                                   (inc frame))
      (spare? (first acc)
              (second acc)) (recur (+ points 10 (nth acc 2))
                                   (nthrest acc 2)
                                   (inc frame))
      :else (recur (+ points (first acc) (second acc))
                   (nthrest acc 2)
                   (inc frame)))))

;; There is a lot happening in each recur making it difficult to read
