package programs;

import java.util.Scanner;

import org.testng.annotations.Test;

/** 
 * A factorial is a function that multiplies number by every number. For example 4!= 4*3*2*1=24. 
 * Factorial Number of 5 is  1*2*3*4*5=120   */

//write a program to find factorial of a given number
public class Factorial {
	@Test(enabled=true)
	public void factorialNumberMethod1(){
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter the value of factorial:");
		num=scan.nextInt();
		
		int fact=1;
		for(int i=1; i<=num; i++){
			fact=fact*i;
		}
		
       System.out.println("Factorial of the given no. is "+fact);
	
	}
	

	@Test(enabled=false)
	public void factorialNumberMethod2(){
		Scanner scan=new Scanner(System.in);
		int input;
		System.out.println("Enter the value of factorial:");
		input=scan.nextInt();
		
		int result=1;
		while(input > 0){
			result=result*input;
			input --;
		}
       System.out.println("Factorail of the given no. is "+result);
	
	}
}
