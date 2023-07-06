package StringPrograms4;

public class PrintTheFirstAndLastCharacterOfEachWordInAString {

	//https://www.geeksforgeeks.org/print-the-first-and-last-character-of-each-word-in-a-string/?ref=rp
	
	// Function to print the first
    // and last character of each word.
    static void FirstAndLast(String str)
    {
        int i;
 
        for (i = 0; i < str.length(); i++) {
 
            // If it is the first word
            // of the string then print it.
            if (i == 0)
                System.out.print(str.charAt(i));
 
            // If it is the last word of the string
            // then also print it.
            if (i == str.length() - 1)
                System.out.print(str.charAt(i));
 
            // If there is a space
            // print the successor and predecessor
            // to space.
            if (str.charAt(i) == ' ') {
                System.out.print(str.charAt(i - 1)
                                 + " "
                                 + str.charAt(i + 1));
            }
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        String str = "Geeks for Geeks";
        FirstAndLast(str);
    }
}
