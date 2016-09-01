(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :as bowling :refer :all]))

(deftest bowling-test 
  (testing "Start a game"
    (is (not (nil? game)))))
