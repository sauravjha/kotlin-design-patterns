package sample

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import sample.adapter.Adapter
import sample.adapter.DataDisplay
import sample.adapter.DatabaseData
import sample.adapter.DisplayDataType

class DatabaseDataGenerator {
    fun generateData(): List<DatabaseData> {
        return listOf(
            DatabaseData(2, 2),
            DatabaseData(3, 10),
            DatabaseData(4, 12),
            DatabaseData(5, 20)
        )
    }
}
object AdapterSpek: Spek({
    describe("Adapter") {
        context("bla") {
            val generateData = DatabaseDataGenerator().generateData()
            val dataDisplay = DataDisplay()
            val adapter = Adapter(dataDisplay)
            val convertData = adapter.convertData(generateData)
            convertData.forEach {
                dataDisplay.displayData(it)
            }

        }
    }
})