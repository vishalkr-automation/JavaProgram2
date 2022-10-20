package programs;

import java.util.Scanner;

//write a program to reverse the given number
public class Reverse_Number {

	public static void main(String[] args) {
		
		int num;
		int remainder;
		int result=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Num:");
		num=scan.nextInt();
		
		while(num>0){
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
     
		System.out.println("Resverse the number is:"+result);
	}

}
