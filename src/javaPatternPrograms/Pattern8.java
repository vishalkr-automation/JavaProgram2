package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Output Program:

EEEEE
DDDDD
CCCCC
BBBBB
AAAAA
 
 */

public class Pattern8 {

	public void method1() {
		
		for(char i='E'; i>='A'; i--){
			for(char j='E'; j>='A'; j--){
				System.out.print(i);
			}
			System.out.println();
		}

	}
	
        public void method2() {
		
		for(char i='E'; i>='A'; i--){
			for(char j='A'; j<='E'; j++){
				System.out.print(i);
			}
			System.out.println();
		}

	} 
	
	@Test
	public void f(){
		//method1();
		
		method2();
	}

}
