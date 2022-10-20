package programs;

import java.util.Scanner;

//Write a program to print maximum of 3 numbers
public class Max_of_3_Nos {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a:");
		a=scan.nextInt();
		
		System.out.println("Enter b:");
		b=scan.nextInt();
		
		System.out.println("Enter c:");
		c=scan.nextInt();
		
		if(a>b && a>c){
			System.out.println("a is bigger number");
		}
		else if(b>a && b>c){
			System.out.println("b is bigger number");
		}
		
		else{
			System.out.println("c is bigger number");
		}

	}

}
