import helper.Numbers
import sorting.BogoSort
import sorting.BubbleSort
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val numbers = Numbers()
    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()

//     BubbleSort
    val time1 = measureTimeMillis {
        val randomList = numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println(randomList)
    }
    println("${time1/1000}")

    // BogoSort
    val time2 = measureTimeMillis {
        val randomList = numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println(randomList)
    }
    println("${time2/1000}")
}