package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd(){
        var calculator = new Calculator();
        var suma = calculator.add(1,2);
        
        assertEquals(3, suma);
    }

    @Test
    public void minus(){
        var calculator = new Calculator();
        var suma = calculator.minus(3,2);

        assertEquals(1, suma);
    }
    
}