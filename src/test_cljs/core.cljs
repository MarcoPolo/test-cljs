(ns test-cljs.core)

(def ^:export t (clj->js {:command "function"}))

(.log js/console t)

