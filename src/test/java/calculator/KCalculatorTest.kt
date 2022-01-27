package calculator

import org.junit.Assert.assertEquals
import org.junit.Test

internal class KCalculatorTest {

    @Test
    fun addTest() {
        val sum = KCalculator().add(1,3)
        assertEquals(4, sum)
    }
}