package programs;

import java.util.Scanner;
/**
A palindrome number is a number that is same after reverse. 
For example 131, 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
 */
public class Palindrome_Number {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=scan.nextInt();
		
		int a=num;
		int reverese=0;
		int remainder;
		
		while(num>0){
			remainder=num%10;
			reverese=reverese*10+remainder;
			num=num/10;
		}
		if(reverese==a)
			System.out.println(a+" is a palindrome number");
			else
			System.out.println(a+" is not a palindrome number");
		
	}

}
