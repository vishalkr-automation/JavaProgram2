package programs2;

public class ProgramToCheckBinaryNumber {
	
	public static boolean isBinary(int number) { 
		int copyOfInput = number;
		
		while (copyOfInput != 0) {
	     
		int temp=copyOfInput%10;
		 
	     if (temp > 1) { 
		 return false; 
		 } 
		 copyOfInput = copyOfInput / 10; 
		 } 
		 return true; 
		 }
		 

	public static void main(String[] args) {
		System.out.println(isBinary(2010));

	}

}
