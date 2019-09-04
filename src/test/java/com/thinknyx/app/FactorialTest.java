package com.thinknyx.app;

/**
 * Unit test for simple App.
 */
/*public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}*/


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {
    
	@Test
    public void calculate_0() {
        Factorial factorial = new Factorial();
        int testStartValue = 0;
        int expectedResult = 0;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
    }
	
	@Test
    public void calculate_1() {
        Factorial factorial = new Factorial();
        int testStartValue = 4;
        int expectedResult = 24;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
	}
	
	@Test
    public void calculate_2() {
        Factorial factorial = new Factorial();
        int testStartValue = 5;
        int expectedResult = 120;

        assertEquals(expectedResult, factorial.calculate(testStartValue));
	}
	
	/*@Test(expected=IllegalArgumentException.class)
    public void calculate_negative() {
        Factorial factorial = new Factorial();
		factorial.calculate(-5);
    }*/
	
}
