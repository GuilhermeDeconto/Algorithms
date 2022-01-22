package math

import java.math.BigInteger

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/15/22
 **/
class Fibonacci {

    private var fibCache: HashMap<Int, BigInteger> = HashMap()

    /**
     * This class implements Fibonacci.
     *
     * Fibonacci's numbers are an integer sequence, called Fibonacci sequence, characterized by the fact that every
     * number after the first two is the sum of the two preceding ones.
     *
     * This class implements the Fibonacci algorithm using memoization which is an optimisation technique used to
     * speed up the process, storing results of expensive function calls and returning the cached value when possible.
     *
     */

    fun fib(n: Int) : BigInteger {
        if (n < 0) {
            throw IllegalArgumentException("Negative number received")
        }
        return fibonacci(n)
    }

    private fun fibonacci(n: Int) : BigInteger {

        if (n <= 1) {
            return n.toBigInteger()
        }

        if (fibCache.containsKey(n)){
            return fibCache.getValue(n)
        }

        val nthFib = fibonacci(n - 1) + fibonacci(n - 2)

        fibCache[n] = nthFib

        return nthFib

    }

}