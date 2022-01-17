package sorting

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class InsertionSort {

    fun insertionSort(array: ArrayList<Int>) {

        for (i in 1 until array.size) {
            val currentValue = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = currentValue
        }

    }
}