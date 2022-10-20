package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Program Output:

ABCDE
 ABCD
  ABC
   AB
    A

*/
public class Pattern33 {

	
	@Test
	public void m1(){
		int n=5;
		for(int i=n; i>0; i--){
			for(int j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++){
				System.out.print((char)(k+65));
			}
			
			System.out.println();
		}
	}
	
	@Test(enabled=false)
	public void m2(){
		
		int n=5;
		int p=5;
		for(char i='E'; i>='A'; i--){
			
			for(int j=n-1; j>=p; j--){
				System.out.print(" ");
			}
			
			for(char k='A'; k<=i; k++){
				System.out.print(k);
			}
			
			p--;
			System.out.println();
		}

	}
	

}
