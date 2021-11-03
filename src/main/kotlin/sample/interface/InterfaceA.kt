package sample.`interface`


//
//class class1(val somevalue: Int) {
//    fun somefun() = run { println("class1") }
//}
val isDivisibleByTwo = { x: Int -> x % 2 == 0 }

val Int.isDivisibleBy2 : Boolean get() =  (this % 2 == 0)

fun main() {
//    listOf(
//        1, 2, 2, 4 , 6
//    ).filter { isDivisibleByTwo(it) }.forEach {
//        println(it)
//    }
//
//    listOf(
//        1, 2, 2, 4 , 6
//    ).filter { it.isDivisibleBy2 }.forEach {
//        println(it)
//    }
}