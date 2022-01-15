import helper.Numbers
import sorting.BubbleSort
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val numbers = Numbers()
    val bubbleSort = BubbleSort()

    val time1 = measureTimeMillis {
        val randomList = numbers.randomList(10, 100000)
        println(bubbleSort.bubbleSort(randomList))
    }
    println("${time1/1000}")
}