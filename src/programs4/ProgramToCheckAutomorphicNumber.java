package programs4;

/*
 A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 
 For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number (25 and 76) itself.
  Some other automorphic numbers are 5, 6, 36, 890625, etc.
 */

public class ProgramToCheckAutomorphicNumber {

	//user-defined static method that checks whether the number is automorphic or not   
	static boolean isAutomorphic(int num)   
	{   
	//determines the square of the specified number  
	int square = num * num;   
	//comparing the digits until the number becomes 0  
	while (num > 0)   
	{   
	//find the remainder (last digit) of the variable num and square and comparing them  
	if (num % 10 != square % 10) {   
	//returns false if digits are not equal  
	return false; 
	}
	//reduce num and square by dividing them by 10  
	num = num/10;   
	square = square/10;   
	}   
	return true;   
	}   
	//Driver code  
	public static void main(String args[])   
	{   
	//number to be check      
	//calling the method and prints the result accordingly  
	System.out.println(isAutomorphic(76) ? "Automorphic" : "Not Automorphic");   
	System.out.println(isAutomorphic(13) ? "Automorphic" : "Not Automorphic");   
	}   
}
