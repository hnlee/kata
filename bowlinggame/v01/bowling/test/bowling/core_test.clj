(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(deftest test-roll
  (testing "Make first roll in a game"
    (is (= [0]
      (roll 0))))

  (testing "Add roll to a game" 
    (is (= [0 0]
      (roll [0] 0))))

  (testing "Add multiple rolls to a game"
    (is (= [0 0 0]
      (roll [0] 0 0)))))

(deftest test-spare?
  (testing "Detect if frame is a spare"
    (is (= true
      (spare? [5 5])))))
      
(deftest test-strike?
  (testing "Detect if frame is a strike"
    (is (= true
      (strike? [10])))))

(deftest test-score
  (testing "Roll games with only zeros"
    (is (= 0 
      (score (apply roll [] (repeat 20 0))))))

  (testing "Roll a game with only ones"
    (is (= 20 
      (score (apply roll [] (repeat 20 1))))))
      
  (testing "Roll a game with one spare"
    (is (= 16
      (score (apply roll [5 5 3] (repeat 17 0))))))

  (testing "Roll a game with one strike"
    (is (= 24
      (score (apply roll [10 3 4] (repeat 16 0))))))
      
  (testing "Roll a perfect game of all strikes"
    (is (= 300
      (score (apply roll [] (repeat 12 10)))))))
