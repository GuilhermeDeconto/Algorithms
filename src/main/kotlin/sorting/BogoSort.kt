package sorting

import helper.Arrays
import kotlin.collections.ArrayList

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class BogoSort {

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
    fun bogoSort(array: ArrayList<Int>) {

        while (!Arrays.isSorted(array)) {
            array.shuffle()
        }
    }
}