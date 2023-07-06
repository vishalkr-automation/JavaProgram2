package regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIfAStringContainsUppercaseLowercaseSpecialCharactersAndNumericValues {

	//Ref - https://www.geeksforgeeks.org/check-if-a-string-contains-uppercase-lowercase-special-characters-and-numeric-values/?ref=rp
	
	// Function that checks if a string
    // contains uppercase, lowercase
    // special character & numeric value
    public static void
    isAllPresent(String str)
    {
        // ReGex to check if a string
        // contains uppercase, lowercase
        // special character & numeric value
        String regex = "^(?=.*[a-z])(?=."
                       + "*[A-Z])(?=.*\\d)"
                       + "(?=.*[-+_!@#$%^&*., ?]).+$";
 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // then print No
        if (str == null) {
            System.out.println("No");
            return;
        }
 
        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);
 
        // Print Yes if string
        // matches ReGex
        if (m.matches())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given string
        String str = "#GeeksForGeeks123@";
 
        // Function Call
        isAllPresent(str);
    }
}
