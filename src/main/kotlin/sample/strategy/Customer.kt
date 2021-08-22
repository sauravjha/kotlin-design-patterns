package sample.strategy


class Customer(
        val name: String,
        val fee: Double,
        val discount: Discount
) {
    fun pricePerMonth() = discount(fee)
}