package sample.iterator

class OtherSentence(
        private val words: List<String>
): Iterable<String> by words