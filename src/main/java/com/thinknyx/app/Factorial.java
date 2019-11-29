package com.thinknyx.app;

/**
 * Hello world!
 *
 */
/**public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}*/
public class Factorial {
    public int calculate(int start) {
		
		int result = start;

		if (start < 0) {
            throw new IllegalArgumentException("Factorials are defined only on non-negative integers.");
        }

        
		

        /**if (result > 1) {
            result = start * calculate(start - 1);
        }**/

        return result;
    }
}