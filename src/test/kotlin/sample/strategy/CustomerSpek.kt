package sample.strategy

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CustomerSpek: Spek({
    describe("customer") {
        context("using normal function") {
            context("and the customer is student") {
                val student = Customer("some-student", 100.0) {
                    studentDiscount(it)
                }
                it("returns half price") {
                    assertThat(student.pricePerMonth(), equalTo(50.0))
                }
            }

            context("and the customer is adult") {
                val adultCustomer = Customer("some-adult", 100.0, ::adultDiscount)
                it("return same value as fee") {
                    assertThat(adultCustomer.pricePerMonth(), equalTo(100.0))
                }
            }
        }
        context("using lambda function") {
            context("and the customer is student") {
                val student = Customer("some-student", 100.0) {
                    studentDiscounts(it)
                }
                it("returns half price") {
                    assertThat(student.pricePerMonth(), equalTo(50.0))
                }
            }

            context("and the customer is adult") {
                val adultCustomer = Customer("some-adult", 100.0, adultDiscounts)
                it("return same value as fee") {
                    assertThat(adultCustomer.pricePerMonth(), equalTo(100.0))
                }
            }
        }


    }
})