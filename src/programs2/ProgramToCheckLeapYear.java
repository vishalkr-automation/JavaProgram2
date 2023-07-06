package programs2;

import org.testng.annotations.Test;

/**
A leap year is exactly divisible by 4 except for century years (years ending with 00). 
The century year is a leap year only if it is perfectly divisible by 400.

Refernece: https://www.programiz.com/java-programming/examples/leap-year
 */

public class ProgramToCheckLeapYear {

	@Test
	public void f(){
		
		int year = 2016;
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
        {
            leap = false;
        }
       
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
		
	}
}
