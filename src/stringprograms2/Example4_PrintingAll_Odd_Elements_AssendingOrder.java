package stringprograms2;

import org.testng.annotations.Test;

public class Example4_PrintingAll_Odd_Elements_AssendingOrder {

	@Test
	public void f(){
		String str = "Welcome to Javatpoint portall";   
		
		for(int i=0; i<=str.length()-1; i++){
			if(i%2!=0){
				System.out.println("char At "+i+" place: "+str.charAt(i));
			}
		} 
		/*int length=str.length();
		System.out.println(length);
		System.out.println(str.charAt(length));*/
	}
}
