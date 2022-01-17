package sorting

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class BubbleSort {

    fun bubbleSort(array: ArrayList<Int>) {
        var swapped = true

        while (swapped){
            swapped = false
            for (i in 0 until array.size - 1) {
                if (array[i] > array[i + 1]) {
                    swapped = true
                    val aux = array[i]
                    array[i] = array[i + 1]
                    array[i + 1] = aux
                }

            }
        }

    }
}