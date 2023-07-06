package programs4;

/*
 Reference - https://www.geeksforgeeks.org/trimorphic-number/
 
 A number T is said to be trimorphic if the cube of T (T*T*T or T3) terminates with T. Let's understand it with the help of examples.

Example 1:

Input:

T = 501

Output:

501 is a trimorphic number.

Explanation: If we multiply 501 by itself 3 times (501 x 501 x 501), we get 125751501, and 125751501 ends with the number 501.
 Hence, 501 is the trimorphic number.

Example 2:

Input:

T = 7

Output:

7 is not a trimorphic number.

Explanation: If we multiply 7 by itself 3 times (7 x 7 x 7), we get 343, and 343 does not end with the number 7. Hence, 7 is not the trimorphic number.
 */

public class ProgramToCheckTrimorphicNumber {

	// Function to check Trimorphic number
    static boolean isTrimorphic(int num)
    {
        // Store the cube
        int cube = num * num * num;
  
        // Start Comparing digits
        while (num > 0) {
  
         // Return false, if any digit
         // of N doesn't match with
         // its cube's digits from last
         if (num % 10 != cube % 10)
            return false;
  
            // Reduce N and cube
            num=num/ 10;
            cube =cube/ 10;
        }
  
        return true;
    }
  
// Driver code
public static void main(String[] args)
    {
        int num = 24;
  
        if (isTrimorphic(num) == true)
        System.out.println("trimorphic");
        else
        System.out.println("not trimorphic");
    }
}
