package programs4;

import java.util.Scanner;

/*
 Multiplying a number by two and three separately, the number obtained by writing the results obtained with the given number 
 will be called a fascinating number. If the result obtained after concatenation contains all digits from 1 to 9, exactly once.

In other words, we can also say that a number (n) may be a fascinating number if it satisfies the following two conditions:

If the given number is a 3 or more than three-digit
If the value getting after concatenation contains all digits from 1 to 9, exactly once.
For example, 192, 1920, 2019, 327, etc. Let's understand the concept of fascinating numbers through an example.

Fascinating Number Example
Let's take any number (n) say 327 and check whether the given number is fascinating or not. On multiplying the given number (n) by 2 and 3, we get:

327×2=654

327×3=981

Now, concatenate the above results to the given number (n).

"327"+"654"+ "981"= 327654981

We observe that the resultant () contains all the digits from 1 to 9, exactly once. Hence, the given number 327 is a fascinating number.
 Note that, we have not added the result to the given number. Some other fascinating numbers are 192, 219, 273, 327, 1902, 1920, 2019 etc.
 */

public class ProgramToCheckFascinatingNumbers {

	public static void main(String args[])  
	{  
	int num1;
	int num2;
	int num3;      
	
	Scanner scan=new Scanner(System.in);  
	System.out.print("Enter any Number: ");  
	
	num1 = scan.nextInt();  
	num2 = num1 * 2;  
	num3 = num1 * 3;  
	
	//concatenating num, n2, and n3  
	String concatstr = num1 + "" + num2 + num3;  
	
	boolean found = true;  
	//checks all digits from 1 to 9 are present or not  
	for(char c = '1'; c <= '9'; c++)  
	{  
	int count = 0;  
	//loop counts the frequency of each digit  
	for(int i = 0; i < concatstr.length(); i++)  
	{  
	char ch = concatstr.charAt(i);  
	//compares the character of concatstr with i  
	if(ch == c)  
	//incerments the count by 1 if the specified condition returns true  
	count++;  
	}  
	//returns true if any of the condition returns true  
	if(count > 1 || count == 0)  
	{  
	found = false;  
	break;  
	}  
	}  
	
	if(found==true)  
	System.out.println(num1 + " is a fascinating number.");  
	else  
	System.out.println(num1 + " is not a fascinating number.");  
	}  
}
