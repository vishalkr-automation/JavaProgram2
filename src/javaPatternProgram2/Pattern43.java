package javaPatternProgram2;

public class Pattern43 {
	
	/*Pattern Desgin is 
	0
   101
  21012
 3210123
432101234

	*/

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=1; i<=n; i++){
			
			for(int j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int k=mcount; k>=1; k--){
				
				System.out.print(Math.abs(k-i));
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
