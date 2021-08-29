package sample.factory

sealed interface Country {
    object Canada: Country
}

object Spain: Country
class Greece(val someProperty: String): Country
data class USA(val someProperty: String): Country

