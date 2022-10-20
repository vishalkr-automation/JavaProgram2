package programs2;

//https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

public class PrintConvertDecimalToRomanNumber {

	public static String intToRoman(int num) {
	    StringBuilder sb = new StringBuilder();
	    int times = 0;
	    String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
	            "XC", "C", "CD", "D", "CM", "M" };
	    int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
	            900, 1000 };
	    for (int i = ints.length - 1; i >= 0; i--) {
	        times = num / ints[i];
	        num %= ints[i];
	        while (times > 0) {
	            sb.append(romans[i]);
	            times--;
	        }
	    }
	    return sb.toString();
	} 
	
	private static String toRoman(int n) {
	    String[] romanNumerals = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I" };
	    int[] romanNumeralNums = {  1000, 900, 500,  400 , 100,  90,  50, 40,  10,    9,   5,  4,  1 };
	    String finalRomanNum = "";

	    for (int i = 0; i < romanNumeralNums.length; i ++) {
	            int currentNum = n /romanNumeralNums[i];
	            if (currentNum==0) {
	                continue;
	            }

	            for (int j = 0; j < currentNum; j++) {
	                //finalRomanNum +=romanNumerals[i];
	            	finalRomanNum =finalRomanNum+romanNumerals[i];
	            }

	            n = n%romanNumeralNums[i];
	    }
	    return finalRomanNum;
	}
	
	public static void main(String... args){
		System.out.println(toRoman(4001));
	}
}
