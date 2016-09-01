(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest test-start-game 
  (testing "Start a game"
    (is (not (nil? (start-game :g))))))

(defn roll-multiples [game pins-seq]
  (loop [pins-seq pins-seq acc game]
    (if (= 0 (count pins-seq))
      acc
      (recur (rest pins-seq) (roll acc (first pins-seq))))))

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

(deftest test-perfect-game
  (testing "Roll a perfect game of all strikes"
    (is (= 300
      (score (roll-multiples (start-game :g)
        (repeat 12 10)))))))
