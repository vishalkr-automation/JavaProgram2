package programs;

import java.util.Scanner;

public class Swapping_temp {

	public static void main(String[] args) {
		int x,y,temp;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter x and y: ");
		x=scan.nextInt();
		y=scan.nextInt();
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping x :" +x+ "and y is: "+y);
	}

}
