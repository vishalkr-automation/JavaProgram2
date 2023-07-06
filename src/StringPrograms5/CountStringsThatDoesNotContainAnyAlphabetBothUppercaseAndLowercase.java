package StringPrograms5;

import java.util.HashMap;

public class CountStringsThatDoesNotContainAnyAlphabetBothUppercaseAndLowercase {

	//https://www.geeksforgeeks.org/count-strings-that-does-not-contain-any-alphabets-both-uppercase-and-lowercase/?ref=rp
	
	// Function to find count of Strings that
	// do not contain the uppercase and
	// lowercase character of same alphabet
	static int countStrings(String[]arr)
	{
	   
	    // Variable to store the answer
	    int count = 0;
	 
	    // Loop to iterate through
	    // the array arr[]
	    for (String x : arr) {
	        boolean isAllowed = true;
	 
	        // Vector to store the frequency
	        // of lowercase characters
	        HashMap<Character,Integer> M = new HashMap<Character,Integer>();
	 
	        // Iterator through the
	        // current String
	        for (char y : x.toCharArray()) {
	            if (y - 'a' >= 0 && y - 'a' < 26) {
	                 if(M.containsKey(y)){
	                        M.put(y, M.get(y)+1);
	                    }
	                    else{
	                        M.put(y, 1);
	                    }
	            }
	        }
	 
	        for (char y : x.toCharArray()) {
	 
	            // Check if any uppercase letter
	            // have its lowercase version
	            if (y - 'A' >= 0 && y - 'A' < 26 && M.containsKey(Character.toLowerCase(y))
	                && M.get(Character.toLowerCase(y)) > 0) {
	                isAllowed = false;
	                break;
	            }
	        }
	 
	        // If current String is not a valid
	        // String, increment the count
	        if (isAllowed) {
	            count += 1;
	        }
	    }
	 
	    // Return Answer
	    return count;
	}
	
	// Driver Code
	public static void main(String[] args)
	{
	    String []arr
	        = { "abcdA", "abcd", "abcdB", "abc" };
	    System.out.print(countStrings(arr));
	}
}
