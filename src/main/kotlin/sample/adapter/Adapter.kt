package sample.adapter

/*
    Adapter converts the interface of the class to the another interface that client except.
*/


interface DatabaseDataConvertor{
    fun convertData(data: List<DatabaseData>): List<DisplayDataType>
}

class Adapter (val display: DataDisplay): DatabaseDataConvertor {
    override fun convertData(data: List<DatabaseData>): List<DisplayDataType> {
        return data.map {
            DisplayDataType(it.position.toFloat(), it.amount.toString())
        }
    }
}