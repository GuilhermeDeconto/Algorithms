package math

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.math.BigInteger

/**
 * @author : Guilherme Dall'Agnol Deconto
 * @since : 1/21/22
 */
internal class FactorialTest {

    @Test
    fun assertEqualsFactorialOfTen() {
        assertEquals(BigInteger.valueOf(3628800), Factorial().fac(10))
    }

    @Test
    fun assertTrueFactorialOfFifteen() {
        assertTrue(Factorial().fac(15) == BigInteger.valueOf(1307674368000))
    }

    @Test
    fun assertThrowsIfNegativeValueIsInformed(){
        assertThrows(IllegalArgumentException::class.java) {
            Factorial().fac(-10)
        }
    }
}