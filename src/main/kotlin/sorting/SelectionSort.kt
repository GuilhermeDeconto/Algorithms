package sorting

import helper.Arrays

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class SelectionSort {

    /**
     * This class implements Selection sort algorithm.
     *
     * Selection sort is an in-place comparison sorting algorithm.
     *
     * This algorithm divides the input in two parts:
     * 1. A sorted sublist of items which is built up from the left to the right at the front of the list.
     * 2. A sublist of the remaining unsorted items that occupy the rest of the list.
     *
     * The algorithm proceeds by finding the smallest (or largest) element in the unsorted sublist,
     * swapping it with the leftmost unsorted element and moving the sublist boundaries one element to the right.
     *
     * This algorithm has the time complexity of O(n2) which makes it inefficient on large datasets and on average it
     * performs worse than insertion sort.
     *
     */

    fun selectionSort(array: ArrayList<Int>) {

        for (i in 0 until array.size) {
            // Assuming the minimum is the first
            var swapIndex = i
            // Test against elements after it
            for (j in i + 1 until array.size) {
                if (array[j] < array[swapIndex]) {
                    // New minimum was found
                    swapIndex = j
                }
            }
            // Swap values
            Arrays.swap(array, i, swapIndex)
        }

    }
}