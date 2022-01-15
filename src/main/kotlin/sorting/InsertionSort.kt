package sorting

class InsertionSort : IInsertionSort {

    override fun insertionSort(array: ArrayList<Int>) {

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