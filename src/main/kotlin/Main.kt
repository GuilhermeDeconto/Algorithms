import helper.Numbers
import math.Fibonacci
import sorting.imp.*
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()
    val bozoSort = BozoSort()
    val mergeSort = MergeSort()
    val insertionsort = InsertionSort()
    val quicksort = Quicksort()

    // BubbleSort
    val bubbleSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println("Bubblesort: $randomList")
    }
    println("${bubbleSortTime/1000}")

    // BogoSort
    val bogoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println("Bogosort: $randomList")
    }
    println("${bogoSortTime/1000}")

    // BozoSort
    val bozoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bozoSort.bozoSort(randomList)
        println("Bozosort: $randomList")
    }
    println("${bozoSortTime/1000}")

    // MergeSort
    val mergeSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        mergeSort.mergeSort(randomList)
        println("Mergesort: $randomList")
    }
    println("${mergeSortTime/1000}")

    // InsertionSort
    val insertionSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        insertionsort.insertionSort(randomList)
        println("Insertionsort: $randomList")
    }
    println("${insertionSortTime/1000}")

    // Quicksort
    val quickSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        quicksort.quicksort(randomList)
        println("Quicksort: $randomList")
    }
    println("${quickSortTime/1000}")

    val fibonacci = Fibonacci()
    val time7 = measureTimeMillis {
        fibonacci.fib(10)
    }
    println("${time7/1000}")
}