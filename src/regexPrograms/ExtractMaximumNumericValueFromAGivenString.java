package regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMaximumNumericValueFromAGivenString {

	//Ref - https://www.geeksforgeeks.org/extract-maximum-numeric-value-given-string-set-2-regex-approach/?ref=rp
	
	// Method to extract the maximum value
    static int extractMaximum(String str)
    {
        // regular expression for atleast one numeric digit
        String regex = "\\d+";
         
        // compiling regex
        Pattern p = Pattern.compile(regex);
         
        // Matcher object
        Matcher m = p.matcher(str);
         
        // initialize MAX = 0
        int MAX = 0;
         
        // loop over matcher
        while(m.find())
        {
            // convert numeric string to integer
            int num = Integer.parseInt(m.group());
             
            // compare num with MAX, update MAX if num > MAX
            if(num > MAX)
                MAX = num;
        }
         
        return MAX;
    }
 
    public static void main (String[] args)
    {
        String str = "100klh564abc365bg";
         
        System.out.println(extractMaximum(str));
    }
}
