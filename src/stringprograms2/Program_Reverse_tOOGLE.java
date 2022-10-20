package stringprograms2;

/**    
yM eMAN sI nAHK 
*/

public class Program_Reverse_tOOGLE {

	public static void main(String[] args) {

		String str = "my name is khan";

		String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        String first=sb.substring(0,1);  
	        String afterfirst=sb.substring(1);  
	        reverseToggle=reverseToggle+first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
		
		System.out.println(reverseToggle);

	}
}
