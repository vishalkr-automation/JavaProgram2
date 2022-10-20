package programs;

import java.util.Scanner;

// write a program to compare two Strings
public class Compare_Two_Strings {

	public static void main(String[] args) {
	String s1, s2;
	Scanner scan=new Scanner(System.in);
	
	 System.out.println("Enter the string1: ");
	 s1=scan.next();
	 
	 System.out.println("Enter the string2: ");
	 s2=scan.next();
	 
	 if(s1.contentEquals(s2))
		 System.out.println("both the Strings are matching");
	 else
		 System.out.println("both the Strings are not matching");	  

	}

}
