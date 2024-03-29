package StringPrograms5;

public class JavaProgramToSwapCornerWordsAndReverseMiddleCharactersOfAString {

	//Ref - https://www.geeksforgeeks.org/java-program-to-swap-corner-words-and-reverse-middle-characters-of-a-string/?ref=rp
	
	 // Method 1
    // To swap corners words
    static void swap(String m, int length)
    {
 
        // Declaring string variables to
        // store the first and last characters
        String first = "";
        String last = "";
 
        // Creating first address variable
        // Initially initializing with zero
        int index = 0;
 
        for (index = 0; index < length; ++index) {
 
            // Checking the space
            if (m.charAt(index) == 32) {
                break;
            }
 
            // Storing the last word in the last variable
            last += m.charAt(index);
        }
 
        // Now creating second address variable
        // Initially initializing with zero
        int index1 = 0;
 
        for (index1 = length - 1; index1 >= 0; --index1) {
            if (m.charAt(index1) == 32) {
                break;
            }
 
            // Storing the First word of the given string
            first = m.charAt(index1) + first;
        }
 
        String middle = "";
        for (int i = index1 - 1; i > index; --i) {
            if (m.charAt(i) == 32) {
                middle += " ";
            }
            else {
 
                // Storing all the middle words
                middle += m.charAt(i);
            }
        }
 
        // Print and display all the string variables
        System.out.print(first + " " + middle + " " + last);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Given custom input string
        String m = "Hello this is the GFG";
 
        // Calculating string length using length() method
        // and storing it in a variable
        int length = m.length();
 
        // Calling the method 1 to swap the words
        // for our custom input string
        swap(m, length);
    }
}
