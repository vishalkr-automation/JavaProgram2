package javaPatternProgram2;

/**
Program Output:

    1
   222
  33333
 4444444
555555555

*/
public class Pattern35 {

	public static void main(String[] args) {
		
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<mcount; k++){
				System.out.print(mcount-i);
			}
			
			mcount=mcount+2;
			System.out.println();
		}

	}

}
