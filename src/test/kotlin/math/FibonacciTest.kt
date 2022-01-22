package math

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.math.BigInteger

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/21/22
 */
internal class FibonacciTest {

    @Test
    fun assertEqualsFibonacciOfTen() {
        assertEquals(BigInteger.valueOf(55), Fibonacci().fib(10))
    }

    @Test
    fun assertTrueFibonacciOfSixteen() {
        assertTrue(BigInteger.valueOf(987) == Fibonacci().fib(16))
    }

    @Test
    fun assertThrowsIfNegativeValueIsInformed(){
        assertThrows(IllegalArgumentException::class.java) {
            Fibonacci().fib(-10)
        }
    }

}