package sorting.imp

import helper.Arrays
import sorting.IBozoSort
import kotlin.random.Random.Default.nextInt

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class BozoSort : IBozoSort {

    override fun bozoSort(array: ArrayList<Int>) {

        while (!Arrays.isSorted(array)) {
            val index1 = nextInt(array.size)
            val index2 = nextInt(array.size)
            Arrays.swap(array, index1, index2)
        }

    }
}