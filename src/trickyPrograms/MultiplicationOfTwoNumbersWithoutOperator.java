package trickyPrograms;

import java.util.Scanner;

public class MultiplicationOfTwoNumbersWithoutOperator {
	
	public static void main(String args[])   
	{  
	Scanner sc=new Scanner(System.in);  
	int num1, num2, sum=0;  
	System.out.print("Enter the first number: ");  
	num1=sc.nextInt();  
	System.out.print("Enter the second number: ");  
	num2=sc.nextInt();  
	//executes until the condition becomes false  
	for(int i=1;i<=num1;i++)  
	{  
	//calculates the sum  
	sum=sum+num2;  
	}  
	//prints the result  
	System.out.println("The multiplication of "+num1+" and "+num2+" is: "+sum);  
	}  

}
