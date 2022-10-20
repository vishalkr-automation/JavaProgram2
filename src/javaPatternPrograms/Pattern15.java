package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Program Output:

*****
****
***
**
*

*/
public class Pattern15 {

	//Method 1
	public void method1() {
		for(int i=1; i<=5; i++){
			
			for(int j=5; j>=i; j--){
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
	
	public void method2(){
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	@Test
	public void f(){
		method1();
		//method2();
	}

}
