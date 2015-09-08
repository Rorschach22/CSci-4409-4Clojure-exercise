;;;Ryan McArthur

;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #10: Intro to Maps

; What I pasted in the box:

20

; which is what is returned from something like:

(= __ (:b {:a 10, :b 20, :c 30}))

;;; Problem #16: Hello World

; What I pasted in the box:

(fn [x] (str "Hello, " x "!"))

; which is an anonymous function that returns something like:

(= ((fn [x] (str "Hello, " x "!")) "Rhea") "Hello, Rhea!")

;;; Problem 17: Sequences: map

; What I pasted in the box:

[6 7 8]

; which is what is returned from something like:

(= __ (map #(+ % 5) '(1 2 3)))

;;; Problem 18: Sequences: filter

; What I pasted in the box:

[6 7]

; which is what is returned from something like:

(= __ (filter #(> % 5) '(3 4 5 6 7)))

;;; Problem 20: Penultimate Element

; What I pasted in the box:

(comp second reverse)

; which is an anonymous function that returns something like:

(= ((comp second reverse) [[1 2] [3 4]]) [1 2])

;;; Problem 21: Nth Element

; What I pasted in the box:

(fn [x y] (first (drop (- (dec (count x)) y) (reverse x))))

; which is an anonymous function that returns something like:

(= ((fn [x y] (first (drop (- (dec (count x)) y) (reverse x)))) '([1 2] [3 4] [5 6]) 2) [5 6])

;;; Problem 23: Reverse a Sequence

; What I pasted in the box:

into ()

;which is an anonymous function that returns something like:

(= (into () [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;;; Problem 25: Find the odd numbers

; What I pasted in the box:

filter odd?

;which is an anonymous function that returns something like:

(= (filter odd? [4 2 1 6]) '(1))

;;; Problem 37: Regular Expressions

; What I pasted in the box:

"ABC"

; which is what is returned from something like:

(= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;;; Problem 40: Interpose a Seq

; What I pasted in the box:

(fn [sep coll] (drop-last (mapcat vector coll (repeat sep))))

;which is an anonymous function that returns something like:

(= ((fn [sep coll] (drop-last (mapcat vector coll (repeat sep)))) :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

;;; Problem 43: Reverse Interleave

; What I pasted in the box:

#(apply (partial map vector) (partition %2 %1))

;which is an anonymous function that returns something like:

(= (#(apply (partial map vector) (partition %2 %1)) (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))

;;; Problem 44: Rotate Sequence

; What I pasted in the box:

(fn f [x a] (if (> x 0) (if (> x 0) (f (dec x) (rest (reverse (cons (first a) (reverse a))))) a) 
                (if (< x 0) (f (inc x) (butlast (cons (last a) a))) a)))

;which is an anonymous function that returns something like:

(= ((fn f [x a] (if (> x 0) (if (> x 0) (f (dec x) (rest (reverse (cons (first a) (reverse a))))) a) 
                (if (< x 0) (f (inc x) (butlast (cons (last a) a))) a))) 2 [1 2 3 4 5]) '(3 4 5 1 2))

;;; Problem 46: Flipping out

; What I pasted in the box:

(fn [f] (fn [a b] (f b a)))

;which is an anonymous function that returns something like:

(= true (((fn [f] (fn [a b] (f b a))) >) 7 8))

;;; Problem 47: Contain yourself

; What I pasted in the box:

4

; which is what is returned from something like:

(contains? #{4 5 6} 4)
