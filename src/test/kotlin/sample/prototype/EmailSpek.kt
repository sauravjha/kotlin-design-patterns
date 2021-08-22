package sample.prototype

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object EmailSpek: Spek({
    describe("Email") {
        context("new email") {
            val email = Email(
                    recipient = "some-one@example.com",
                    subject = "Hello",
                    message = "Some message"
            )
            val changeEmail = email.copy(recipient = "anyone@example.com", subject = "Re:Hello")
            it("email is changed") {
                assertThat(changeEmail.recipient, equalTo("anyone@example.com"))
            }
        }
    }
})