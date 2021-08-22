package sample.iterator
/*

    Provide a way to access the element of an aggregation object
    sequentially without exposing its underlining representation.
 */

class Sentence(val words: List<String>)

operator fun Sentence.iterator(): Iterator<String> = words.iterator()