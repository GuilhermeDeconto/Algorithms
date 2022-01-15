package sorting.imp

import helper.Arrays
import sorting.IQuicksort
import kotlin.random.Random.Default.nextInt

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class Quicksort : IQuicksort {

    override fun quicksort(array: ArrayList<Int>) {
        quicksort(array,0, array.size - 1)
    }

    private fun quicksort(array: ArrayList<Int>, lowIndex: Int, highIndex: Int) {

        if (lowIndex >= highIndex) {
            return
        }

        val pivotIndex = nextInt(highIndex - lowIndex) + lowIndex
        val pivot = array[pivotIndex]
        Arrays.swap(array, pivotIndex, highIndex)

        val leftPointer = partition(lowIndex, highIndex, array, pivot)

        quicksort(array, lowIndex, leftPointer - 1)
        quicksort(array, leftPointer + 1, highIndex)

    }

    private fun partition(lowIndex: Int, highIndex: Int, array: ArrayList<Int>, pivot: Int): Int {
        var leftPointer = lowIndex
        var rightPointer = highIndex

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--
            }
            Arrays.swap(array, leftPointer, rightPointer)
        }

        Arrays.swap(array, leftPointer, highIndex)
        return leftPointer
    }
}