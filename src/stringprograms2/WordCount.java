package stringprograms2;

public class WordCount {
	
	//Method 1
	static void wordCount1(String str){
		String[] strCount=str.split("\\s+");
		int count=strCount.length;
		System.out.println("No of words Available in String: "+ count);
		
	}

	
  public static void main(String[] args) {  
      String string ="India    Is My Country";  
     
     
     wordCount1(string);
       
}  
}
