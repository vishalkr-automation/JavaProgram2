package javaPatternProgram2;

public class Pattern44 {
	
	/*Pattern Desgin is 
	A
   BAB
  CBABC
 DCBABCD
EDCBABCDE

	*/

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		int l=1;
		
		for(int i=1; i<=n; i++){
			
			for(int j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=mcount; k++){
				
				System.out.print((char)(Math.abs(k-l)+65));
			}
			
			l=l+1;
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
