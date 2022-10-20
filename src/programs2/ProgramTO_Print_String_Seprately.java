package programs2;

public class ProgramTO_Print_String_Seprately {
	
	public static void printNumbersSeprately(){
		
		String str="ABCDEFGH";
		
		for(int i=0; i<str.length(); i++){
			System.out.println(str.charAt(i)+" ");
		}
		
	}
	
 public static void printNumbersSepratelyInReverseOrder(){
		
	    String str="ABCDEFGH";
		
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i)+" ");
		}
		
	}
	
	public static void main(String... args){
		printNumbersSepratelyInReverseOrder();
		
		
	}
}
