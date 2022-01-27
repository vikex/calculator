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

        assertEquals(-1, sum);
    }
    
}

