package javaPatternProgram2;

/**
Program Output:
    1
   123
  12345
 1234567
123456789

*/
public class Pattern39 {

	public static void main(String[] args) {
		int n=5;
		int mcount=1;
		
		for(int i=0; i<n; i++){
			
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=mcount; k++){
				
				System.out.print(k);
			}
			
			mcount=mcount+2;
			System.out.println();
		}
		

	}

}
