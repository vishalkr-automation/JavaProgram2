package javaPatternPrograms;

/**
Program Output:

A
BB
CCC
DDDD
EEEEE


*/
public class Pattern13 {

	public static void main(String[] args) {
		
		for(char i='A'; i<='E'; i++){
			for(char j='A'; j<=i; j++){
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
