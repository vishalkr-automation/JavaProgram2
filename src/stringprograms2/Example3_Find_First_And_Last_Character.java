package stringprograms2;

import org.testng.annotations.Test;

public class Example3_Find_First_And_Last_Character {

	@Test
	public void f(){
		 String str = "Welcome to Javatpoint portal"; 
		 
		 int strLength=str.length();
		 // Fetching first character  
		    System.out.println("Character at 0 index is: "+ str.charAt(0));      
		    
		    // The last Character is present at the string length-1 index  
		    System.out.println("Character at last index is: "+ str.charAt(strLength-1)); 
		    
		   
		
	}
}
