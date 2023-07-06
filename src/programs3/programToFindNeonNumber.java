package programs3;

import java.util.Scanner;

/*
 *Reference - https://www.javatpoint.com/neon-number-in-java
 Neon Number - A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
 For example if the input number is 9, its square is 9*9 = 81 and sum of the digits (8+1) is 9. i.e. 9 is a neon number.
 */


/*
 Output:
 Enter the number to check: 9
 9 is a Neon Number.
 */
public class programToFindNeonNumber {
	
	public static void main(String args[])  
	{  
	
	int sum = 0;      
	
	Scanner scan = new Scanner(System.in);  
	System.out.print("Enter the number to check: ");   
	int num = scan.nextInt();    
	int square = num * num;  
	
	//loop executes until the condition becomes false  
	while(square != 0)  
	{  
	//find the last digit of the square      
	int remainder = square % 10;  
	//adds digits to the variable sum  
	sum = sum + remainder;  
	//removes the last digit of the variable square  
	square = square / 10;  
	}  
 
	if(num == sum)  
	System.out.println(num + " is a Neon Number.");  
	else  
	System.out.println(num + " is not a Neon Number.");  
	}  

}
