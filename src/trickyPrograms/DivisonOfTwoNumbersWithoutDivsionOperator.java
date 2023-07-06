package trickyPrograms;

import java.util.Scanner;

/*
 Output:
Enter the value to num1: 500
Enter the value to num2: 25
Division is: 20
 */

public class DivisonOfTwoNumbersWithoutDivsionOperator {
	
	public static void main(String args[]){//main method
		int div,result=0;//variable declaration
		Scanner scan=new Scanner(System.in);
		//create a scanner instance for receives input
		// from the user - input from keyboard
		System.out.print("Enter the value to num1: ");
		int num1=scan.nextInt();//Reading the input for num1
		System.out.print("Enter the value to num2: ");
		int num2=scan.nextInt();//Reading the input for num2
		while(num1>=num2) { 
		num1=num1-num2; 
		result++;
		    
		}
		System.out.println("Division is:"+result);
		}

}
