package programs;

import java.util.Scanner;

// how do you reverse a String
public class String_Reverse {

	public static void main(String[] args) {
		String str, rev="";
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
		str=scan.next();
		
		int length=str.length();
		for(int i=length-1; i>=0; i--){
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reverse of the entered string is: "+rev);
	}

}
