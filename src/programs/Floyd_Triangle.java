package programs;

import java.util.Scanner;

// write a program to print floyd's Triangle
public class Floyd_Triangle {

	public static void main(String[] args) {
		
		
		int n, num = 1;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of floyd's triangle you want");
	      n = in.nextInt();
	 
	      System.out.println("Floyd's triangle :-");
	 
	      for (int i = 1 ; i <= n ; i++ )
	      {
	         for (int j = 1 ; j <= i ; j++ )
	         {
	            System.out.print(num+" ");
	            num++;
	         }
	 
	         System.out.println();
	      }
	}

}
