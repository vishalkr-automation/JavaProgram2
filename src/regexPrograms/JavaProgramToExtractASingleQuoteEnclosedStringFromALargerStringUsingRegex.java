package regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProgramToExtractASingleQuoteEnclosedStringFromALargerStringUsingRegex {

	//Ref - https://www.geeksforgeeks.org/java-program-to-extract-a-single-quote-enclosed-string-from-a-larger-string-using-regex/?ref=rp
	
	// Main driver method
    public static void main(String[] args)
    {
        // Custom input
        String string1
            = "Out of this String I want 'Geeks for Geeks' only";
 
        // Desired custom output
        String string2
            = "The data that I want is'Java Regex'";
 
        // Paranthesis indicate it is a group and signifies
        // it can have substring enclosed in single quote
        Pattern p = Pattern.compile(".*'([^']*)'.*");
 
        // This method returns a pattern object
 
        // Calling matcher() method of pattern object
        // and passing input character sequence
        Matcher m1 = p.matcher(string1);
        Matcher m2 = p.matcher(string2);
 
        // Printing complete entered string 1
        System.out.println("String to be extracted : "
                           + string1);
 
        // Condition check using matches() method which
        // looks out for content if any in single quote
        if (m1.matches()) {
 
            // Print the required sub-string
            System.out.println("Extracted part         : "
                               + m1.group(1));
        }
 
        // New line
        System.out.println();
 
        // Printing complete entered string 2
        System.out.println("String to be extracted : "
                           + string2);
 
        // Condition check using matches() method which
        // looks out for content if any in single quote
        if (m2.matches()) {
 
            // Print the required sub-string
            System.out.println("Extracted part         : "
                               + m2.group(1));
        }
    }
}
