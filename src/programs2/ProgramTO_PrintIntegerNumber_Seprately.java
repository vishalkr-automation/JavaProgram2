package programs2;

public class ProgramTO_PrintIntegerNumber_Seprately {
	
	public static void printNumbersSeprately(){
		
		int x=123456789;
		String str=String.valueOf(x);
		
		for(int i=0; i<str.length(); i++){
			System.out.println(str.charAt(i)+" ");
		}
		
	}
	
 public static void printNumbersSepratelyInReverseOrder(){
		
		int x=123456789;
		String str=String.valueOf(x);
		
		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i)+" ");
		}
		
	}
	
	public static void main(String... args){
		printNumbersSepratelyInReverseOrder();
		
		
	}
}
