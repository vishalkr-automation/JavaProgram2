package programs;

import java.util.Scanner;

// write a program to find whether the given number is Armstrong or not
//Armstrong number is a number that is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
//For example, 371 is an Armstrong number since 3*3*3 + 7*7*7 + 1*1*1 = 371.
public class Armstrong_Number {

	public static void main(String[] args) {
	int num;
	System.out.println("Enter num: ");
	Scanner scan=new Scanner(System.in);
	num=scan.nextInt();
	
	int a=num;
	int check=0;
	int remainder;
	
	while(num>0){
		remainder=num%10;
		check=check+(int)Math.pow(remainder, 3);
		num=num/10;
	}
	if(check==a)
		System.out.println(a+" is a Armstrong number");
	else
		System.out.println(a+" is not a armstrong number");
		
		  
   
		
	}

}
