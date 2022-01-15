package search

import sorting.imp.Quicksort

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class BinarySearch {

    /**
     * This class implements Binary search.
     *
     * Binary search or logarithmic search is a search algorithm to find a value within a sorted list.
     * This algorithm compares the target value to the middle element of the array and if they are not equal the half
     * in which the target cannot lie is eliminated and the search continues on the remaining half.
     * If the algorithm finishes and the remaining half is empty, then the target value is not in the provided array.
     *
     * This algorithm has the time complexity of O(log(n)) since it splits the search area by two every iteration.
     *
     */

    fun binarySearch(array: ArrayList<Int>, target: Int) : Int {
        Quicksort().quicksort(array)

        var startIndex = 0
        var endIndex = array.size - 1

        while(startIndex <= endIndex){
            val centerIndex: Int = (startIndex + endIndex) / 2
            when {
                target == array[centerIndex] -> {
                    return centerIndex
                }
                target < array[centerIndex] -> {
                    endIndex = centerIndex - 1
                }
                target > array[centerIndex] -> {
                    startIndex = centerIndex + 1
                }
            }
        }

        return -1
    }
}