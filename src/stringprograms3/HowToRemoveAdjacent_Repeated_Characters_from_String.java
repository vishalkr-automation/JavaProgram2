package stringprograms3;

//https://www.java67.com/2022/02/how-to-remove-all-adjacent-duplicates-from-string-.html

public class HowToRemoveAdjacent_Repeated_Characters_from_String {

	 public static String removeAdjacentRepeatedCharacters(String str) {
	        if (str == null) {
	            return null;
	        }
	        char[] chars = str.toCharArray();
	        char previous = ' ';
	        int i = 0;
	        for (char c: chars) {
	            if (c != previous) {
	                chars[i++] = c;
	                previous = c;
	            }
	        }
	        return new String(chars).substring(0, i);
	    }
	    public static void main(String[] args) {
	       
	        //String string1 = "aabaarbarccrabmq";
	        String string2 = "marry";
	        //System.out.println(removeAdjacentRepeatedCharacters(string1));
	        System.out.println(removeAdjacentRepeatedCharacters(string2));  //output - mary
	    }
}
