package javaPatternPrograms;

/**
Program Output:
    1
   12
  123
 1234
12345

*/
public class Pattern26 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=5; i++){
			
			for(int j=n-1; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++){
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
