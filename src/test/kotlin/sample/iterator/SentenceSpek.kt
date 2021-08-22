package sample.iterator

import com.natpryce.hamkrest.assertion.assertThat
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object SentenceSpek: Spek({
    describe("sentence") {
        context("iterator") {
            val words = listOf("I", "am", "dad")
            val sentence = Sentence(words)
            for (s in sentence) {
                println(s)
            }
            sentence.iterator().forEach {
                println(it)
            }
        }
    }
})