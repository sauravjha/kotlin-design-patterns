package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import sample.visitor.Rectangle
import sample.visitor.Square
import sample.visitor.perimeterVisitor

object PerimeterVisitor: Spek({
    describe("shape") {
        context("square") {
            val square = Square(2.0)
            val squarePerimeter = perimeterVisitor(square)
            it("perimeter of square is returned") {
                assertThat(squarePerimeter, equalTo(8.0))
            }
        }
        context("rectangle") {
            val square = Rectangle(3.0, 4.0)
            val squarePerimeter = perimeterVisitor(square)
            it("perimeter of square is returned") {
                assertThat(squarePerimeter, equalTo(14.0))
            }
        }
    }
})