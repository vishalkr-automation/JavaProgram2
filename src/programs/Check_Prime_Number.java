package programs;

import java.util.Scanner;

/** 
Prime number is a number that is greater than 1 and divided by 1 or itself only.
 In other words, prime numbers can't be divided by other numbers than itself or 1. 
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */

public class Check_Prime_Number {

	public static void main(String[] args) {
		int num;
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number: ");
		 num=scan.nextInt();
		 
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is Prime Number");
		else
		   System.out.println(num + " is not Prime Number");

	}

}
