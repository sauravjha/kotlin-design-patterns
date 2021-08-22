package sample.strategy

fun adultDiscount(fee: Double): Double {
    return fee - (0*fee)
}
/*
    Equivalent function as above
*/

val adultDiscounts = {fee: Double -> fee }