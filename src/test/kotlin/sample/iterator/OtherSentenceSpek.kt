package sample.iterator

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object OtherSentenceSpek: Spek({
    describe("OtherSentence") {
        val words = listOf("I", "am", "dad")
        val otherSentence = OtherSentence(words)
        context("otherSentence") {
            otherSentence.forEach {
                println(it)
            }
        }
    }
})