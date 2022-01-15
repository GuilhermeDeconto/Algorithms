package sorting

import kotlin.collections.ArrayList

class BogoSort : IBogoSort {

    /**
     * This class implements the BogoSort algorithm.
     *
     * BogoSort is a super inefficient sorting algorithm based on the "generate and test" paradigm.
     * This function successively generates permutations of its input until it finds one that is sorted.
     *
     * The probability that any given randomly generated sort is correct is (1 / n!)
     * The average case time complexity is O(n!), where n is the number of elements in the array.
     *
     */
    override fun bogoSort(array: ArrayList<Int>) {

        while (!isSorted(array)) {
            array.shuffle()
        }
    }

    private fun isSorted(array: ArrayList<Int>): Boolean {
        if (array.isEmpty()) {
            return true
        }

        val size = array.size

        if (size <= 1) {
            return true
        }

        for (i in 0 until size - 1){
            if (array[i] > array[i + 1]) {
                return false
            }
        }

        return true

    }

}