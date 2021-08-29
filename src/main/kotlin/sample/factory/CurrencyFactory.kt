package sample.factory
/*
    FACTORY PATTERN ->
    Provides a way to access functionality without caring about the implementation.
    Separation of concern and testability
 */

object CurrencyFactory {
    fun currencyOfCountry(country: Country): Currency {
        return when(country) {
            is Country.Canada -> Currency("CAD")
            is USA -> Currency("USA")
            is Greece, is Spain -> Currency("EUR")
        }
    }
}