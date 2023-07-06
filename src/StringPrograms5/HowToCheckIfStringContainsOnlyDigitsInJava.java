package StringPrograms5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowToCheckIfStringContainsOnlyDigitsInJava {

	//Reference - https://www.geeksforgeeks.org/how-to-check-if-string-contains-only-digits-in-java/?ref=lbp
	
	/*
	 Time Complexity: O(N), where N is the length of the given string. 
     Auxiliary Space: O(1)
	 */
	//using - Using Traversal
    public static boolean onlyDigits(String str, int n)
    {
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
 
            // Check if character is not a digit between 0-9 then return false
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
          // If we reach here, that means all characters were digits.
        return true;
    }
    
    //Using Character.isDigit(char ch)
    
    public static boolean onlyDigitsMethod2(String str, int n)
    {
 
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
 
            // Check if the specified
            // character is a not digit
            // then return false,
            // else return false
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
          // If we reach here that means all
          // the characters were digits,
          // so we return true
        return true;
    }
    
    //Using Regular Expression
    public static boolean onlyDigits(String str)
    {
        // Regex to check string
        // contains only digits
        String regex = "[0-9]+";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);
 
        // Return if the string
        // matched the ReGex
        return m.matches();
    }
    
    //Using Contains method and ArrayList
    public static boolean onlyDigitsMethod4(String str, int n)
    {
        String num="0123456789";
        ArrayList<Character> numbers = new ArrayList<Character>();
        for(int i=0;i<num.length();i++)
        {
            numbers.add(num.charAt(i));
        }
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {
 
            // Check if character is
            // not a digit between 0-9
            // then return false
            if (!numbers.contains(str.charAt(i))) {
                return false;
            }
        }
        // If we reach here, that means
        // all characters were digits.
        return true;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "1a234";
        int len = str.length();
 
        // Function Call
        System.out.println(onlyDigits(str, len));
    }
}
