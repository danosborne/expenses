(ns expenses.core-test
  (:require ;;[expenses.simples :refer [expenses]]
            [midje.sweet :refer :all]))

(facts "about calculating expenses"
       (fact "is true"
             #_(expenses "Beer" M -> GBP20 -> [M D])
             (identity true) => true))
