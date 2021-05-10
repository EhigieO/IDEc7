package aftrica.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testThatCalculatorCanAdd(){
        //Given
        Calculator myCalculator = new Calculator();
        //when
        int sum = myCalculator.add(2,6);
        //check / assert
        assertEquals(8, sum);
        int result = myCalculator.add(6,11);
        assertEquals(17, result);

    }
    @Test
    public void testThatCalculatorCanMultiply(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.multiply(5,5);
        assertEquals(25, result);

    }
    @Test
    public void testThatCalculatorCanSubtract(){
        Calculator calculator = new Calculator();
        int difference = calculator.subtract(8,5);
        assertEquals(3,difference);
        System.out.print(difference);
    }
    @Test
    public void testThatTheCalculatorCanSubtract(){
        Calculator calculator = new Calculator();
        int quotient = calculator.quotient(8,2);
        assertEquals(4,quotient);
        System.out.print(quotient);
        }
}
