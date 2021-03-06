package helper

import java.math.BigInteger
import java.security.SecureRandom
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.random.Random.Default.nextInt

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
object Numbers {

    fun randomList(size: BigInteger): ArrayList<BigInteger> {
        val random = SecureRandom()
        val randomList = ArrayList<BigInteger>()
        var aux: BigInteger = BigInteger.ZERO

        while (aux < size){
            val positive = abs(random.nextInt())
            randomList.add(positive.toBigInteger())
            aux++
        }

        return randomList
    }

    fun randomList(size: Int, maxValue: Int): ArrayList<Int> {
        val randomNumbers = ArrayList<Int>()

        for (i in 0 until size) {
            randomNumbers.add(nextInt(0, maxValue))
        }

        return randomNumbers

    }

}