package javaPatternPrograms;

/**
 Program Output:
 
    A
   AB
  ABC
 ABCD
ABCDE

*/
public class Pattern28_2 {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=0; i<n; i++){
			for(int j=n-1; j>i; j--){
				System.out.print(" ");
				
			}
			for(int k=0; k<=i; k++){
				System.out.print((char)(k+65));
			}
			
			System.out.println();
		}

	}

}
