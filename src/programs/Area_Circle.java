package programs;

import java.util.Scanner;

//write a program to calculate Area of circle
public class Area_Circle {

	public static void main(String[] args) {
		int radius;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter raduis of Circle: ");
		radius=scan.nextInt();
		
		//use Math.PI constant to get value of PI
		double area=Math.PI*radius*radius;
		
		System.out.println("Area of circle is :"+area);
			
	}

}
