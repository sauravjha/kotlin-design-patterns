package sample.builder

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CarSpek: Spek({
    describe("car") {
        context("builder") {
            val car = Car().apply {
                color = "blue"
                doors = 5
            }
            it("returns the correct value") {
                assertThat(car.color, equalTo("blue"))
                assertThat(car.doors, equalTo(5))
            }
        }
        context("builder with variable") {
            val config: Car.() -> Unit = {
                color = "green"
                doors = 2
            }
            var car = Car().apply(config)
            it("returns the correct value") {
                assertThat(car.color, equalTo("green"))
                assertThat(car.doors, equalTo(2))
            }
        }
    }
})