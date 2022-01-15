import helper.Numbers
import math.Fibonacci
import sorting.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()
    val bozoSort = BozoSort()
    val mergeSort = MergeSort()
    val insertionsort = InsertionSort()

    // BubbleSort
    val time1 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println("Bubblesort: $randomList")
    }
    println("${time1/1000}")

    // BogoSort
    val time2 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println("Bogosort: $randomList")
    }
    println("${time2/1000}")

    // BozoSort
    val time3 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bozoSort.bozoSort(randomList)
        println("Bozosort: $randomList")
    }
    println("${time3/1000}")

    // MergeSort
    val time4 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        mergeSort.mergeSort(randomList)
        println("Mergesort: $randomList")
    }
    println("${time4/1000}")

    // InsertionSort
    val time5 = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        insertionsort.insertionSort(randomList)
        println("Insertionsort: $randomList")
    }
    println("${time5/1000}")
}