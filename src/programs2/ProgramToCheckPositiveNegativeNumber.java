package programs2;

import org.testng.annotations.Test;

public class ProgramToCheckPositiveNegativeNumber {
	
	@Test
	public void f(){
		
		double number = 12.3;
        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");
        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");
        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");
		
	}

}
