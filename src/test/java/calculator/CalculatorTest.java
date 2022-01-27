package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        var calculator = new Calculator();
        var sum = calculator.add(1,2);
        
        assertEquals(3, sum);
    }

    @Test
    public void minusGreaterFromLower(){
        var calculator = new Calculator();
        var sum = calculator.minus(3,2);

        assertEquals(1, sum);
    }

    @Test
    public void minusLowerFromGreater(){
        var calculator = new Calculator();
        var sum = calculator.minus(1,2);

        assertEquals(-1, sum);
    }

    @Test
    public void minusZeroStaySame(){
        var calculator = new Calculator();
        var sum = calculator.minus(3,0);

        assertEquals(3, sum);
    }
    @Test
    public void mnozenieStandard() {
        var calculator = new Calculator();
        var sum = calculator.mnozenie(5, 5);

        assertEquals(25, sum);
    }
    @Test
    public void mnozenieZero() {
        var calculator = new Calculator();
        var sum = calculator.mnozenie(5, 0);

        assertEquals(0, sum);
    }
    @Test
    public void mnozenieMinus() {
        var calculator = new Calculator();
        var sum = calculator.mnozenie(5, -5);

        assertEquals(-25, sum);
    }
    @Test
    public void dzielenie() {
        var calculator = new Calculator();
        var sum = calculator.dzielenie(25, 5);

        assertEquals(5, sum);
    }
    @Test(expected = ArithmeticException.class)
    public void dzielenieZero() {
        var calculator = new Calculator();
        var sum = calculator.dzielenie(5, 0);

        assertEquals(0, sum);
    }
}

