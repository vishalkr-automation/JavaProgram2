package javaPatternProgram2;

/**
Program Output:
    1
   321
  54321
 7654321
987654321
*/
public class Pattern40 {

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=mcount; k>=1; k--){
				
				System.out.print(k);
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
