package programs;

import org.testng.annotations.Test;

/**
The positive numbers 1, 2, 3... are known as natural numbers and its sum is the result 
of all numbers starting from 1 to the given number.
For n, the sum of natural numbers is:
1 + 2 + 3 + ... + n
 */

public class SumOfNaturalNumbers {
	
	@Test
	public void sumOfNaturalNumbersMethod1(){
		
		int num = 10, sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
	}
	
	
	@Test
	public void sumOfNaturalNumbersMethod2(){
		int num = 10, i = 1, sum = 0;
        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
	}
	

}
