package programs3;


//What is anagram String
//Two strings are said to be anagram if we can form one string by arranging the characters of another string. 
//For example, Race and Care. Here, we can form Race by arranging the characters of Care.

//Reference Website
//https://www.programiz.com/java-programming/examples/check-if-two-strings-are-anagram#:~:text=Two%20strings%20are%20said%20to,arranging%20the%20characters%20of%20Care.

import java.util.Arrays;

public class FindAnagramString {
	
public static void main(String args[]) {
	String str1 = "Race";
    String str2 = "Care";
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // check if length is same
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
}

}
