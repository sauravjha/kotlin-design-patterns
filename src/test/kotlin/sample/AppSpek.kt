package sample

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object AppSpek: Spek({
    describe("App") {
        context("greeting"){
            it("returns \"Hello world.\"") {
                assertThat(App().greeting, equalTo("Hello world."))
            }
        }
    }
})