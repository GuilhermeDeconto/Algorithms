import datastructure.Stack
import helper.Numbers
import math.Factorial
import math.Fibonacci
import search.BinarySearch
import search.LinearSearch
import sorting.*
import kotlin.system.measureTimeMillis

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
fun main(args: Array<String>) {

    // Sorting
    val bubbleSort = BubbleSort()
    val bogoSort = BogoSort()
    val bozoSort = BozoSort()
    val mergeSort = MergeSort()
    val insertionSort = InsertionSort()
    val quicksort = Quicksort()
    val selectionSort = SelectionSort()

    // Math
    val fibonacci = Fibonacci()
    val factorial = Factorial()

    // Search
    val linear = LinearSearch()
    val binarySearch = BinarySearch()

    // BubbleSort
    val bubbleSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bubbleSort.bubbleSort(randomList)
        println("Bubble sort: $randomList")
    }
    println("${bubbleSortTime / 1000}")

    // BogoSort
    val bogoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bogoSort.bogoSort(randomList)
        println("Bogo sort: $randomList")
    }
    println("${bogoSortTime / 1000}")

    // BozoSort
    val bozoSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        bozoSort.bozoSort(randomList)
        println("Bozo sort: $randomList")
    }
    println("${bozoSortTime / 1000}")

    // MergeSort
    val mergeSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        mergeSort.mergeSort(randomList)
        println("Merge sort: $randomList")
    }
    println("${mergeSortTime / 1000}")

    // InsertionSort
    val insertionSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        insertionSort.insertionSort(randomList)
        println("Insertion sort: $randomList")
    }
    println("${insertionSortTime / 1000}")

    // Quicksort
    val quickSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        quicksort.quicksort(randomList)
        println("Quick sort: $randomList")
    }
    println("${quickSortTime / 1000}")

    // SelectionSort
    val selectionSortTime = measureTimeMillis {
        val randomList = Numbers.randomList(10, 100000)
        selectionSort.selectionSort(randomList)
        println("Selection sort: $randomList")
    }
    println("${selectionSortTime / 1000}")

    val fibonacciTime = measureTimeMillis {
        println("Fibonacci of 10: ${fibonacci.fib(10)}")
    }
    println("${fibonacciTime / 1000}")

    val factorialTime = measureTimeMillis {
        println("Factorial of 10: ${factorial.fac(10)}")
    }
    println("${factorialTime / 1000}")

    val time9 = measureTimeMillis {
        val target = 2
        val result = linear.linearSearch(arrayListOf(1, 2, 3, 4, 5), target)
        println("Linear Search: Index of target ($target) is $result")
    }
    println("${time9 / 1000}")

    val time10 = measureTimeMillis {
        val target = 5
        val result = binarySearch.binarySearch(arrayListOf(1, 5, 3, 6, 9, 2, 4), target)
        println("Binary Search: Index of target ($target) is $result")
    }
    println("${time10 / 1000}")

    val stack = Stack(5)
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.printStack()
    stack.pop()
    println(stack.peek())
    println(stack.getSize())
}