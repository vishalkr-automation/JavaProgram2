package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Output Pattern:

54321
54321
54321
54321
54321

*/
public class Pattern7 {

	public void method1() {
    for(int i=5; i>=1; i--){
    	
    	for(int j=5; j>=1; j--){
    		System.out.print(j);
    	}
    	System.out.println();
    }

	}
	
	public void method2() {

	    for(int i=1; i<=5; i++){
	    	
	    	for(int j=5; j>=1; j--){
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }

		}
	
	
	@Test
	public void f1(){
		//method1();
		method2();
	}

}
