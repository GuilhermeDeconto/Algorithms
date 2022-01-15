package helper

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
object Arrays {

    fun isSorted(array: ArrayList<Int>): Boolean {
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

    fun swap(array: ArrayList<Int>, index1: Int, index2: Int) {
        val temp = array[index1]
        array[index1] = array[index2]
        array[index2] = temp
    }
}