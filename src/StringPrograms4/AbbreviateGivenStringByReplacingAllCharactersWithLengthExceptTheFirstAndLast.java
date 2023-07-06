package StringPrograms4;

public class AbbreviateGivenStringByReplacingAllCharactersWithLengthExceptTheFirstAndLast {

	//https://www.geeksforgeeks.org/abbreviate-given-string-by-replacing-all-characters-with-length-except-the-first-and-last/?ref=rp
	
	// Function to convert the given
	  // string into its abbreviation
	  static void abbreviateWord(String str)
	  {
	 
	    // Stores the length of the string
	    int len = str.length();
	 
	    // Print 1st character
	    System.out.print(str.charAt(0));
	 
	    // Print count of characters
	    // in between
	    System.out.print(len - 2);
	 
	    // Print last character
	    System.out.print(str.charAt(len - 1));
	  }
	 
	  // Driver Code
	  public static void main(String args[])
	  {
	    String str = "internationalization";
	    abbreviateWord(str);
	 
	  }
}
