package programs;

import java.util.Scanner;

/*Java palindrome program: Java program to check if a string is a palindrome or not.
 *  Remember a string is a palindrome if it remains unchanged when reversed, 
 *  for example "dad" is a palindrome as reverse of "dad" is "dad" whereas "program" is not a palindrome. 
 * Some other palindrome strings are "mom", "madam", "abcba"
 */
public class Palindrome_String {

	public static void main(String[] args) {
	String str, rev="";
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a String to check if it palindrome or not: ");
	str=scan.nextLine();
	
	int length=str.length();
	for(int i=length-1; i>=0; i--){
		rev=rev+str.charAt(i);
			}
	   if(str.equalsIgnoreCase(rev))
		   System.out.println("palindrome");
	   else
		   System.out.println("not palindrome");

	}

}
