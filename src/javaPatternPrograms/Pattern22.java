package javaPatternPrograms;

/**
Program Output:

EEEEE
DDDD
CCC
BB
A

*/
public class Pattern22 {

	public static void main(String[] args) {
		
		for(char i='E'; i>='A'; i--){
			for(char j='A'; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
