package stringprograms2;

public class RemoveAParticularChracter {

	 
     public static void charRemoveAt(String str, int p) {  
        String str2= str.substring(0, p) + str.substring(p + 1); 
        System.out.println(str2);
     }
     
     public static void main(String[] args) {  
         String str = "India is my country";  
        charRemoveAt(str, 7);  
      } 
}
