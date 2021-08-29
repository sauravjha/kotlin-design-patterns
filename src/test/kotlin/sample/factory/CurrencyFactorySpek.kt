package sample.factory

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CurrencyFactorySpek: Spek({
    describe("CurrencyFactory") {
        context("when the instance if for Spain") {
            val currencyOfCountry = CurrencyFactory.currencyOfCountry(Greece("some value"))
            it("returns the correct code") {
                assertThat(currencyOfCountry.code, equalTo("EUR"))
            }
        }
    }
})