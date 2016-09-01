(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :as bowling :refer :all]))

(deftest test-start-game 
  (testing "Start a game"
    (is (not (nil? (start-game :g))))))

(defn roll-multiples [game pins]
  (loop [i 0 acc game]
    (if (< i (- (count pins) 1))
      (recur (inc i) (roll acc (nth pins i)))
      (roll acc (nth pins i)))))

(deftest test-gutter-game
  (testing "Roll games with only zeros"
    (is (= 0 
      (score (roll-multiples (start-game :g) 
        (repeat 20 0)))))))

(deftest test-all-ones
  (testing "Roll a game with only ones"
    (is (= 20 
      (score (roll-multiples (start-game :g) 
        (repeat 20 1)))))))

(deftest test-one-spare
  (testing "Roll a game with one spare"
    (is (= 16
      (score (roll-multiples (start-game :g)
        (concat [5 5 3] (repeat 17 0))))))))

(deftest test-one-strike
  (testing "Roll a game with one strike"
    (is (= 24
      (score (roll-multiples (start-game :g)
        (concat [10 3 4] (repeat 16 0))))))))
