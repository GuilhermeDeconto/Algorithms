import helper.Numbers
import sorting.BogoSort
import sorting.BozoSort
import sorting.BubbleSort
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()
    val bozoSort = BozoSort()

//     BubbleSort
    val time1 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println(randomList)
    }
    println("${time1/1000}")

    // BogoSort
    val time2 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println(randomList)
    }
    println("${time2/1000}")

    // MergeSort
    val time4 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bozoSort.bozoSort(randomList)
        println(randomList)
    }
    println("${time4/1000}")
}