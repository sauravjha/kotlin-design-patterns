package sample.strategy

fun studentDiscount(fee: Double): Double {
    return (fee - (.5*fee))
}

val studentDiscounts = { raw: Double -> raw/2}