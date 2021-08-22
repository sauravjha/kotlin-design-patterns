package sample.visitor
/*
    Visitor: Prepresent an operation to be performed on th
    element on an object structure.
    a Visitor lets you define a new operator on which it operates
 */

sealed class Shape
data class Square(val side: Double): Shape()
data class Circle(val radius: Double): Shape()
data class Rectangle(val width: Double, val height: Double): Shape()
