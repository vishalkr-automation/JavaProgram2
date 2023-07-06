package programs4;

import java.util.Scanner;

/*
 A number is called a sunny number if the number next to the given number is a perfect square. In other words,
  a number N will be a sunny number if N+1 is a perfect square.
  
Sunny Number Example:

Suppose, we have to check if 80 is a sunny number or not.

Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.

Let's take another number 10.

Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10 is not a sunny number.
 */

public class ProgramToCheckSunnyNumber {
   
	//function checks whether the given is a perfect square or not   
	static boolean findPerfectSquare(double num)   
	{   
	//finds the square root of the ggiven number  
	double square_root = Math.sqrt(num);   
	//if square root is an integer   
	return((square_root - Math.floor(square_root)) == 0);   
	}   
	
	//function that checks whether the given number is Sunny or not  
	static void isSunnyNumber(int N)   
	{   
	//checks N+1 is perfect square or not  
	if (findPerfectSquare(N + 1)==true)   
	{   
	System.out.println("The given number is a sunny number.");   
	}    
	else  
	{   
	System.out.println("The given number is not a sunny number.");   
	}   
	}   
	
	public static void main(String args[])   
	{   
	Scanner scan = new Scanner(System.in);  
	System.out.print("Enter a number to check: ");   
	int num=scan.nextInt();  
	
	isSunnyNumber(num);    //80
	
	}    
}
