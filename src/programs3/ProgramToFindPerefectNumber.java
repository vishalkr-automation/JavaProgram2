package programs3;

//Reference - https://www.javatpoint.com/perfect-number-program-in-java

/*
 A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
  In other words, if the sum of positive divisors (excluding the number itself) of a number equals the number itself is called a perfect number.
   Let's understood it through an example.

Example of a Perfect Number
Let's take the number 496 and check it is a perfect number or not.

First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248. 
Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
We observe that the sum of factors is equal to the number itself. Hence, the number 496 is a perfect number. Similarly, we can check other numbers also. 
 * */

import java.util.Scanner;

import org.testng.annotations.Test;

public class ProgramToFindPerefectNumber {
	
	//function that checks if the given number is perfect or not  
	static long isPerfect(long num)  
	{  
	//variable stores the sum      
	long sum=0;  
	//executes until the condition becomes false  
	for(int i=1; i <= num/2; i++)  
	{  
	if(num % i == 0)  
	{  
	//calculates the sum of factors  
	sum=sum + i;  
	}  
	}  
	//returns the sum of factors  
	return sum;   
	} //end of method  
	
	public static void main(String args[])    
	{  
	long number, s;  
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number: ");  
	//reads a number from the user  
	number=sc.nextLong();  
	//calling the function  
	s = isPerfect(number);  
	//compares sum with the number  
	if(s==number)  
	System.out.println(number+" is a perfect number");  
	else  
	System.out.println(number+" is not a perfect number");   
	}   
}
