package programs;

import java.util.Scanner;

//write a program to find sum of its digits
public class Sum_Of_digits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input;
		System.out.println("Enter the value to calculate its sum:");
		input=scan.nextInt();
		
		int lastdigit;
		int sum=0;
		while(input !=0){
			//gives you to last digit of input number
			 lastdigit=input % 10;
			sum=sum+lastdigit;
			//removes last digit of the input number
			input=input/10;	
		}
		System.out.println("Sum of its digit is: "+sum);

	}

}
