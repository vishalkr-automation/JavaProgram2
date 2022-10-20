package javaPatternPrograms;

/**
Program Output:

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

*/
public class Pattern4 {
	

	public static void main(String[] args) {
		
		for(char i='A'; i<='E'; i++){
			
			for(char j='A'; j<='E'; j++){
				
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
