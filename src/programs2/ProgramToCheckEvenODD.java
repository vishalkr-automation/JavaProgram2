package programs2;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ProgramToCheckEvenODD {
	
	@Test
	public void f(){
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}

}
