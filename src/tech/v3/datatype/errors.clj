(ns tech.v3.datatype.errors
  (:import [org.apache.commons.math3.exception NotANumberException]))


(defmacro throwf
  [message & args]
  `(throw (Exception. (format ~message ~@args))))


(defmacro throw-nan
  []
  `(throw (NotANumberException.)))


(defmacro check-nan-error
  [arg]
  `(if (Double/isNaN ~arg)
     (throw-nan)
     arg))
