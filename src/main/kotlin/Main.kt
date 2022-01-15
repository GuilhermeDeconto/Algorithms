import helper.Numbers
import math.Factorial
import math.Fibonacci
import sorting.imp.*
import kotlin.system.measureTimeMillis

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
fun main(args: Array<String>) {

    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()
    val bozoSort = BozoSort()
    val mergeSort = MergeSort()
    val insertionSort = InsertionSort()
    val quicksort = Quicksort()
    val selectionSort = SelectionSort()
    val fibonacci = Fibonacci()
    val factorial = Factorial()

    // BubbleSort
    val bubbleSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println("Bubble sort: $randomList")
    }
    println("${bubbleSortTime/1000}")

    // BogoSort
    val bogoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println("Bogo sort: $randomList")
    }
    println("${bogoSortTime/1000}")

    // BozoSort
    val bozoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bozoSort.bozoSort(randomList)
        println("Bozo sort: $randomList")
    }
    println("${bozoSortTime/1000}")

    // MergeSort
    val mergeSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        mergeSort.mergeSort(randomList)
        println("Merge sort: $randomList")
    }
    println("${mergeSortTime/1000}")

    // InsertionSort
    val insertionSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        insertionSort.insertionSort(randomList)
        println("Insertion sort: $randomList")
    }
    println("${insertionSortTime/1000}")

    // Quicksort
    val quickSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        quicksort.quicksort(randomList)
        println("Quick sort: $randomList")
    }
    println("${quickSortTime/1000}")

    // SelectionSort
    val selectionSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        selectionSort.selectionSort(randomList)
        println("Selection sort: $randomList")
    }
    println("${selectionSortTime/1000}")

    val fibonacciTime = measureTimeMillis {
        fibonacci.fib(10)
    }
    println("${fibonacciTime/1000}")

    val factorialTime = measureTimeMillis {
        factorial.fac(10)
    }
    println("${factorialTime/1000}")
}