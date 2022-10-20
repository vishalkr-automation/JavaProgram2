package javaPatternProgram2;

/**
Program Output:
    1
   333
  55555
 7777777
999999999
 */

public class Pattern36 {

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<mcount; k++){
				
				System.out.print(mcount);
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
