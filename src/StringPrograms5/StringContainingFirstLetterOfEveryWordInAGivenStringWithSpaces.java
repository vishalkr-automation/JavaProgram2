package StringPrograms5;

public class StringContainingFirstLetterOfEveryWordInAGivenStringWithSpaces {

	//https://www.geeksforgeeks.org/string-containing-first-letter-every-word-given-string-spaces/?ref=rp
	
	//Method 1
	// Function to find string which has first
    // character of each word.
    static String firstLetterWord(String str)
    {
        String result = "";
 
        // Traverse the string.
        boolean v = true;
        for (int i = 0; i < str.length(); i++)
        {
            // If it is space, set v as true.
            if (str.charAt(i) == ' ')
            {
                v = true;
            }
             
            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false.
            else if (str.charAt(i) != ' ' && v == true)
            {
                result += (str.charAt(i));
                v = false;
            }
        }
 
        return result;
    }
 
    
    //Method 2
    private static StringBuilder charBuffer = new StringBuilder();
    
    public static String processWords(String input)
    {
         /* we are splitting the input based on
            spaces (s)+ : this regular expression
            will handle scenarios where we have words
            separated by multiple spaces */
         String s[] = input.split("(\\s)+");
          
         for(String values : s)
         {
            /* charAt(0) will pick only the first character
               from the string and append to buffer */
             charBuffer.append(values.charAt(0));
         }
          
       return charBuffer.toString();
    }
     

    // Driver code
    public static void main(String[] args)
    {
        String str = "geeks for geeks";
        System.out.println(firstLetterWord(str));
        System.out.println(processWords(str));
    }
}
