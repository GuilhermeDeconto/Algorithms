package helper

import java.math.BigInteger

interface INumbers {
    fun randomList(size: BigInteger) : ArrayList<BigInteger>
    fun randomList(size: Int, maxValue: Int): ArrayList<Int>
}