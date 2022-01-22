package math

import java.math.BigInteger

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class Factorial {

    private var facCache: HashMap<Int, BigInteger> = HashMap()

    /**
     * This class implements Factorial.
     *
     * Factorial of a non-negative integer n, denoted by n!, is the product of all positive integers
     * less than or equal to n.
     *
     * Example:
     * 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 = 3.628.800
     *
     * This class implements the Factorial algorithm using memoization which is an optimisation technique used to
     * speed up the process, storing results of expensive function calls and returning the cached value when possible.
     *
     */

    fun fac(n: Int) : BigInteger {
        if (n < 0) {
            throw IllegalArgumentException("Negative number received")
        }
        return factorial(n)
    }

    private fun factorial(n: Int) : BigInteger {
        return when {
            n == 0 -> {
                BigInteger.ONE
            }
            facCache.containsKey(n) -> {
                facCache.getValue(n)
            }
            else -> {
                val nthFac = factorial(n - 1) * n.toBigInteger()
                facCache[n] = nthFac
                nthFac
            }
        }

    }

}