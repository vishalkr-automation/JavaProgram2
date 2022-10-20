package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Output Program:

EDCBA
EDCBA
EDCBA
EDCBA
EDCBA

*/
public class Pattern9 {

	public void method1() {

     for(char i='E';  i>='A'; i--){
    	 for(char j='E'; j>='A'; j--){
    		 System.out.print(j);
    	 }
    	 System.out.println();
    	 
     }

	}
	
	public void method2() {

	     for(char i='A';  i<='E'; i++){
	    	 for(char j='E'; j>='A'; j--){
	    		 System.out.print(j);
	    	 }
	    	 System.out.println();
	    	 
	     }

		}
	
	
	public void method3() {

	     for(int i=1;  i<=5; i++){
	    	 for(char j='E'; j>='A'; j--){
	    		 System.out.print(j);
	    	 }
	    	 System.out.println();
	    	 
	     }

		}
	
	@Test
	public void f(){
		
		//method1();
		//method2();
		method3();
	}

}
