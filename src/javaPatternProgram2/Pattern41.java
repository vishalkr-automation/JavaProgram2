package javaPatternProgram2;

public class Pattern41 {
	
	/*Pattern Desgin is 
	    A
	   ABC
	  ABCDE
	 ABCDEFG
	ABCDEFGHI
	*/

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<mcount; k++){
				
				System.out.print((char)(65+k));
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
