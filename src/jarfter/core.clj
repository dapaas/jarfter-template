(ns jarfter.core
  (:require [grafter.tabular :refer [make-dataset]])
  (:gen-class))

(defn find-transformation [trans]
  @(get (ns-map 'grafterizer.transformation) 'my-transformation))

(defn -main [& args]
  (require 'grafterizer.transformation)
  ;; todo add serialization code here

  (let [transformation (find-transformation 'my-transformation)]

    (println (transformation (make-dataset [[1 2 3]
                                            [4 5 6]])))))
