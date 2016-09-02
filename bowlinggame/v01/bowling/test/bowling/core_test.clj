(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest test-start-game
  ;; I'm not really sure what this is testing
  (testing "Start a game"
    ;; Since this is always going to return an empty vector it would be
    ;; nicer to test to see if it's return an empty vector
    (is (not (nil? (start-game :g))))))

(defn roll-multiples
  [game pins-seq]
  ;; pins-seq did not stand out to me what it meant at first without diving into the code
  ;;
  ;; I don't understand what roll-multiples is doing here. In test-gutter-game
  ;; it be passed an empty vector and (repeat 20 0) and roll multiples returns
  ;; (vec (repeat 20 0)). See changes to tests below
  (loop [pins-seq pins-seq acc game]
    (if (= 0 (count pins-seq))
      acc
      (recur (rest pins-seq)
             ;; I'm not sure how I feel having a helper test function use production code,
             ;; especially when the production code does not have a test covering it
             (roll acc (first pins-seq))))))

(deftest test-gutter-game
  ;; Basic test that satisfies one end of the spectrum +1
  (testing "Roll games with only zeros"
    (is (= 0
           (score
            (vec
             (repeat 20 0)))))))

(deftest test-all-ones
  ;; Nice nice -- easy to understand looking at it
  (testing "Roll a game with only ones"
    (is (= 20
           (score
            (vec
             (repeat 20 1)))))))

(deftest test-one-spare
  (testing "Roll a game with one spare"
    (is (= 16
           (score
            (vec
             (concat [5 5 3]
                     (repeat 17 0))))))))

(deftest test-one-strike
  (testing "Roll a game with one strike"
    (is (= 24
           (score
            (vec
             (concat [10 3 4]
                     (repeat 16 0))))))))

(deftest test-perfect-game
  ;; Test that satisfies the other end of the spectrum +1
  ;;
  ;; it woud be clearer if I knew what the repeat blah blah was representing,
  ;; assigning it to a var makes it easier for people coming into a project
  ;; without any context
  (testing "Roll a perfect game of all strikes"
    (let [game (vec (repeat 12 10))]
      (is (= 300
             (score game))))))

;; Where are the tests for roll/strike/spare? See cloverage report
