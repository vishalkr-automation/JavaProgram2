package StringPrograms4;

public class PrintLastCharacterOfEachWordInAString {

	//https://www.geeksforgeeks.org/print-last-character-of-each-word-in-a-string/?ref=rp
	  // Function to print the last character
    // of each word in the given string
    static void printLastChar(String str)
    {
 
        // Now, last word is also followed by a space
        str = str + " ";
        for (int i = 1; i < str.length(); i++) {
 
            // If current character is a space
            if (str.charAt(i) == ' ')
 
                // Then previous character must be
                // the last character of some word
                System.out.print(str.charAt(i - 1) + " ");
        }
    }
 
    // Driver code
    public static void main(String s[])
    {
        String str = "Geeks for Geeks";
        printLastChar(str);
    }
}
