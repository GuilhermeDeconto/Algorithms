package search

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class LinearSearch {

    /**
     * This class implements Linear search.
     *
     * Linear search or sequential search is a method for finding a value within a list.
     * This algorithm sequentially checks each element of the list for the target value until a match is found or until
     * all the elements have been searched.
     *
     * This algorithm has the time complexity of O(n) since in worst case scenario it'll check each element once.
     *
     */

    fun linearSearch(array: ArrayList<Int>, target: Int): Int? {
        for ((index,element) in array.withIndex()) {
            if (element == target) {
                return index
            }
        }
        return null
    }

}