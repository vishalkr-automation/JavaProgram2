 package javaPatternPrograms;

/**
Program Output:

A
AB
ABC
ABCD
ABCDE

*/
public class Pattern14 {

	public static void main(String[] args) {

      for(char i='A'; i<='E'; i++){
    	  for(char j='A'; j<=i; j++){
    		  System.out.print(j);
    	  }
    	  System.out.println();
      }

	}

}
