package stringprograms3;

//https://www.geeksforgeeks.org/frequent-word-array-strings/

public class ProgramToCountMostOccurnaceOfWordFromArray{
	
		public static void mostFrequentWord(String arr[], int n)
		  {
		 
		    // freq to store the freq of the most occurring variable
		    int finalCount = 0;
		 
		    // res to store the most occurring string in the array of
		    // strings
		    String mostlyUsedWord = "";
		 
		    // running nested for loops to find the most occurring
		    // word in the array of strings
		    for (int i = 0; i < n; i++) {
		      int tempCount = 1;
		      for (int j = i + 1; j < n; j++) {
		        if (arr[j].equals(arr[i])) {
		        	tempCount++;
		        }
		      }
		 
		      // updating our max freq of occurred string in the
		      // array of strings
		      if (tempCount >= finalCount) {
		        finalCount = tempCount;
		    	mostlyUsedWord = arr[i];
		      }
		    }
		 
		    System.out.println("The word that occurs most is : " + mostlyUsedWord);
		    System.out.println("No of times: " + finalCount);
		  }
		 
		  public static void main (String[] args)
		  {
		 
		    // given set of keys
		    String arr[] = { "geeks",   "for",   "geeks", "a",    "portal",
		                    "to",      "learn", "can",   "be",   "computer",
		                    "science", "zoom",  "yup",   "fire", "in",
		                    "be",      "data",  "geeks" };
		    int n = arr.length;
		 
		    mostFrequentWord(arr, n);
		  }
}
