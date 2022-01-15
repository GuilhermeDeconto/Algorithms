package sorting.imp

import sorting.IMergeSort

class MergeSort : IMergeSort {

    override fun mergeSort(array: ArrayList<Int>) {
        val size = array.size

        if (size < 2) {
            return
        }

        val midIndex = size.div(2)
        val leftHalf = ArrayList<Int>()
        val rightHalf = ArrayList<Int>()

        for (i in 0 until midIndex) {
            leftHalf.add(array[i])
        }

        for (i in midIndex until size) {
            rightHalf.add(array[i])
        }

        mergeSort(leftHalf)
        mergeSort(rightHalf)

        merge(array, leftHalf, rightHalf)

    }

    private fun merge(array: ArrayList<Int>, leftHalf: ArrayList<Int>, rightHalf: ArrayList<Int>) {
        val leftSize = leftHalf.size
        val rightSize = rightHalf.size

        var i = 0
        var j = 0
        var k = 0

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i]
                i++
            } else {
                array[k] = rightHalf[j]
                j++
            }
            k++
        }

        while (i < leftSize) {
            array[k] = leftHalf[i]
            i++
            k++
        }

        while (j < rightSize) {
            array[k] = rightHalf[j]
            j++
            k++
        }
    }

}