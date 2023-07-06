package regexPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProgramToExtractAnHTMLTagFromAStringUsingRegEx {

	//Ref - https://www.geeksforgeeks.org/java-program-to-extract-an-html-tag-from-a-string-using-regex/?ref=rp
	
	public static void main(String[] args)
    {
        String str = "Learning from <h1>GeeksforGeeks<h1>";
       
        // pattern object creation
        Pattern pattern = Pattern.compile("<h1>(/S+)</h1>");
       
        // now the above compiled pattern will be checked
        // for its availability in target string
        Matcher matcher = pattern.matcher(str);
 
        if (matcher.find()) {
            String instr = matcher.group(1);
            System.out.println(instr);
        }
    }
}
