package StringPrograms5;

public class CheckIfLowercaseAndUppercaseCharactersAreInSameOrder {

	//Ref - https://www.geeksforgeeks.org/check-if-lowercase-and-uppercase-characters-are-in-same-order/?ref=rp
	
	 //Function to check if both the
    //case follow the same order
    static boolean isCheck(String str)
    {
 
     int len = str.length();
     String lowerStr = "", upperStr = "";
 
     char[] str1 = str.toCharArray();
     // Traverse the string
     for (int i = 0; i < len; i++) {
 
         // Store both lowercase and uppercase
         // in two different strings
          
         if ((int)(str1[i]) >= 65 && (int)str1[i] <= 91)
             upperStr = upperStr + str1[i];
 
         else
             lowerStr = lowerStr + str1[i];
     }
 
     // transform lowerStr1 to upper
     String transformStr = lowerStr.toUpperCase();
      
     return(transformStr.equals(upperStr));
 
    }
 
    //Driver code
    public static void main(String[] args) {
 
        String str = "geeGkEEsKS";
 
        if (isCheck(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
