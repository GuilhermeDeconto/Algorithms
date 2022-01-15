package sorting

class BubbleSort : IBubbleSort {

    override fun bubbleSort(array: ArrayList<Int>): ArrayList<Int> {
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

        return array

    }
}