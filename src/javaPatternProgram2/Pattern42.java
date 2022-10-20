package javaPatternProgram2;

public class Pattern42 {
	
	/*Pattern Desgin is 
	A
   CBA
  EDCBA
 GFEDCBA
IHGFEDCBA

	*/

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=mcount; k++){
				
				System.out.print((char)(mcount-k+65));
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
