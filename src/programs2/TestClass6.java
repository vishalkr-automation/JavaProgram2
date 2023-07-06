package programs2;

public class TestClass6 {
	
	public static void main(String[] args){
		
	//System.out.println(getExcelColumnNumber("BC"));
	
	System.out.println(getExcelColumnName(55));
	}
	
	 public static int getExcelColumnNumber(String column) {
	        int result = 0;
	        column=column.toUpperCase();
	        for (int i = 0; i < column.length(); i++) {
	            result = result*26;
	            result =result + column.charAt(i) - 'A' + 1;
	        }
	        return result;
	    }
	 
	 
	 public static String getExcelColumnName(int number) {
	        final StringBuilder sb = new StringBuilder();

	        int num = number - 1;
	        while (num >=  0) {
	            int numChar = (num % 26)  + 65;
	            sb.append((char)numChar);
	            num = (num  / 26) - 1;
	        }
	        return sb.reverse().toString();
	    }
	
}
