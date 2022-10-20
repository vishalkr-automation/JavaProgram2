package javaPatternPrograms;

/**
Program Output:

EDCBA
EDCB
EDC
ED
E

*/
public class Pattern23 {

	public static void main(String[] args) {
		
		for(char i='A'; i<='E'; i++){
			
			for(char j='E'; j>=i; j--){
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
