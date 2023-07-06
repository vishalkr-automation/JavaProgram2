package stringprograms3;

//https://www.java67.com/2016/09/3-ways-to-count-words-in-java-string.html

public class ProgramToCountNumberOf_Words_In_Letter_WithoutAny_Utility_Methods {
	
	  public static int count(String word) {
		  //String word=" This is a India";
		   
		  if (word == null || word.isEmpty()) {
		      return 0;
		    }

		    int wordCount = 0;

		    boolean isWord = false;
		    int endOfLine = word.length() - 1;
		    char[] characters = word.toCharArray();

		    for (int i = 0; i < characters.length; i++) {

		      // if the char is a letter, word = true.
		      if (Character.isLetter(characters[i]) && i != endOfLine) {
		        isWord = true;

		        // if char isn't a letter and there have been letters before,
		        // counter goes up.
		      } else if (!Character.isLetter(characters[i]) && isWord) {
		        wordCount++;
		        isWord = false;

		        // last word of String; if it doesn't end with a non letter, it
		        // wouldn't count without this.
		      } else if (Character.isLetter(characters[i]) && i == endOfLine) {
		        wordCount++;
		      }
		    }

		    return wordCount;
		  }
	  
	  public static void main(String[] args) {
             //String input="India is My country";
             String input="I++";
		   
		      System.out.printf("Number of words of string: "+ input+" :"+count(input));
		    

}}
