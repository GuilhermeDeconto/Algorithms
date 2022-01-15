package helper

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
}