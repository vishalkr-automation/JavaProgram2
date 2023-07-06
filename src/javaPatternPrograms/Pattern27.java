package javaPatternPrograms;

/* A
   BB
  CCC
 DDDD
EEEEE
*/

public class Pattern27 {

	public static void main(String[] args) {
		int n=5;
		int p=1;
		for(char i='A'; i<='E'; i++){
			
			for(int j=n-1; j>=p; j--){
				System.out.print(" ");
				
			}
			
			for(char k='A'; k<=i; k++ ){
				System.out.print(i);
			}
			
			System.out.println();
			p++;
			
		}

	}

}
