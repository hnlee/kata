(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :as bowling :refer :all]))

(deftest test-start-game 
  (testing "Start a game"
    (start-game game)
    (is (not (nil? game)))))
(deftest test-roll-zero
  (testing "Roll a ball with score 0"
    (roll game 0)
    (is (= (score game) 0))))
