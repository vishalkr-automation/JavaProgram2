package StringPrograms4;

import java.util.ArrayList;

public class FindTheWordFromAGivenSentenceHavingGivenWordAsPrefix {

	//https://www.geeksforgeeks.org/find-the-word-from-a-given-sentence-having-given-word-as-prefix/?ref=rp
	
	// Function to find the position
	// of the string having word as prefix
	static String isPrefixOfWord(String sentence,
	                             String Word)
	{
	    String a[] = sentence.split(" ");
	   
	    // Initialize an ArrayList
	    ArrayList<String> v = new ArrayList<>();
	     
	    // Extract words from the sentence
	    for(String e : a)
	        v.add(e);
	     
	    // Traverse each word
	    for(int i = 0; i < v.size(); i++)
	    {
	         
	        // Traverse the characters of word
	        for(int j = 0; j < v.get(i).length(); j++)
	        {
	             
	            // If prefix does not match
	            if (v.get(i).charAt(j) != Word.charAt(j))
	                break;
	                 
	            // Otherwise
	            else if (j == Word.length() - 1)
	             
	                // Return  the word
	                return v.get(i);
	        }
	    }
	     
	    // Return -1 if not present
	    return "-1";
	}
	 
	// Driver code 
	public static void main(final String[] args)
	{
	    String s = "Welcome to Geeksforgeeks";
	    String word = "Gee";
	   
	    System.out.println(isPrefixOfWord(s, word));
	}
	
	
}
