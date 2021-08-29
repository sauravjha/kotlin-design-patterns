package sample.singleton

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object DatabaseDriverSpek : Spek({
    describe("DatabaseDriver") {
        context("bla") {
            val instance1 = DatabaseDriver.log()
            val instance2 = DatabaseDriver.log()
            it("is only initialized once") {
                assertThat(instance1, equalTo(DatabaseDriver))
                assertThat(instance2, equalTo(DatabaseDriver))
                assertThat(instance1, equalTo(instance2))
            }
        }
    }
})