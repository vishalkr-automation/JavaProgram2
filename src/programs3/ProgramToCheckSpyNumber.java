package programs3;

import java.util.Scanner;

/*
  Spy Number - A positive integer is called a spy number if the sum and product of its digits are equal.
  In other words, a number whose sum and product of all digits are equal is called a spy number.
  
  Example of Spy Number
  Let's take the number 1124 and check whether the number is a spy or not. First, we will split it into digits (1, 1, 2, 4). After that find the sum and product of all the digits.

 Sum=1+1+2+4=8

 Product=1*1*2*4=8

 We observe that the sum and product of the digits both are equal. Hence, 1124 is a spy number.

 Similarly, we can check other numbers also. Some other spy numbers are 22, 123, 132, etc.
  
 */

public class ProgramToCheckSpyNumber {

	public static void main(String args[])  
	{    
	int sum=0;
	int product=1; 
	int lastdigit;  
 
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number to check: " );   
	int num=sc.nextInt(); 
	
	//executes untill the condition becomes false  
	while(num>0)  
	{  
	//finds the last digit of the number      
	lastdigit=num%10;  
	//adds last digit to the variable sum  
	sum=sum+lastdigit;  
	//calculates the product  
	product=product*lastdigit;  
	//removes the last digit from the given number  
	num=num/10;  
	}  
	
	if(sum==product)    
	System.out.println("The given number is a spy number.");  
	else  
	System.out.println("The given number is not a spy number.");  
	}  
}
