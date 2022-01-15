package sorting

import helper.Arrays
import kotlin.random.Random.Default.nextInt

class BozoSort : IBozoSort {

    override fun bozoSort(array: ArrayList<Int>) {

        while (!Arrays.isSorted(array)) {
            val index1 = nextInt(array.size)
            val index2 = nextInt(array.size)
            val aux = array[index1]

            array[index1] = array[index2]
            array[index2] = aux
        }

    }
}