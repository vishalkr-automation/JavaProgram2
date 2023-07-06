package StringPrograms5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountOfStringsThatDoesNotContainAnyCharacterOfAGivenString {

	//Ref - https://www.geeksforgeeks.org/count-of-strings-that-does-not-contain-any-character-of-a-given-string/?ref=rp
	
	// Function to count the number of strings
	  // that does not contain any character of string str
	  public static int allowedStrings(List<String> arr,
	                                   String str)
	  {
	    int ans = 0;
	    Set<Character> st = new HashSet<Character>();
	 
	    char[] chararray = str.toCharArray();
	    for (Character x : chararray) {
	      st.add(x);
	    }
	 
	    for (int i = 0; i < arr.size(); i++) {
	      String x = arr.get(i);
	      boolean allowed = true;
	      char[] chararray2 = x.toCharArray();
	      for (Character y : chararray2) {
	 
	        // If the character is present in st
	        if (st.contains(y)) {
	          allowed = false;
	          break;
	        }
	      }
	 
	      // If the string doesn't
	      // have any character of st
	      if (allowed) {
	        ans += 1;
	      }
	    }
	 
	    return ans;
	  }
	 
	  public static void main(String[] args)
	  {
	    List<String> arr = new ArrayList<String>();
	    arr.add("abcd");
	    arr.add("hijk");
	    arr.add("xyz");
	    arr.add("ayt");
	    String str = "apple";
	    System.out.println(allowedStrings(arr, str));
	  }
}
