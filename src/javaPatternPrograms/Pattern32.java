package javaPatternPrograms;

import org.testng.annotations.Test;

/**
Output Program:

EEEEE
 DDDD
  CCC
   BB
    A

 */

public class Pattern32 {

	@Test(enabled=true)
	public static void method2(){
		int n=5;
		for(int i=n-1; i>=0; i--){
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<=i; k++){
				System.out.print((char)(i+65));
			}
			
			System.out.println();
		}
	}
	
	
	    @Test(enabled=false)
		public static void method1() {
			int n = 5;
			int p = 5;
			for (char i = 'E'; i >= 'A'; i--) {

				for (int j = n - 1; j >= p; j--) {
					System.out.print(" ");
				}

				for (char k = 'A'; k <= i; k++) {
					System.out.print(i);
				}
				p--;
				System.out.println();

			}

		}

}
