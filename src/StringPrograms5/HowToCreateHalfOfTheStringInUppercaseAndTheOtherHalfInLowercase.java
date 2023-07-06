package StringPrograms5;

public class HowToCreateHalfOfTheStringInUppercaseAndTheOtherHalfInLowercase {

	//https://www.geeksforgeeks.org/how-to-create-half-of-the-string-in-uppercase-and-the-other-half-in-lowercase/?ref=rp
	
	//method 1
	public static String convertFun(String s1)
	{
	    int half=s1.length()/2;
	    String s2=s1.substring(0,half).toUpperCase();
	    String s3=s1.substring(half).toLowerCase();
	    String str4=s2+s3;
	    return str4;
	  
	}
	
	//method 2
	public static String convertFun2(String s1, int n) {
		
		 String upper="";
		 String lower="";
	    // Running loop on first half and making it
	    // upper case
	    for (int i = 0; i < n / 2; i++) {
	    	upper =upper+s1.charAt(i);
	    }
	   
	    // Running loop on secone half
	    for (int i = n / 2; i < n; i++) {
	        lower =lower+s1.charAt(i);
	    }
	    
	    return upper.toUpperCase()+lower.toLowerCase();
		
	}
	
	public static void main(String...args) {
		String s1 = "geeksforgeeks";
		int n = s1.length();
	    //System.out.println(convertFun(s1));
		System.out.println(convertFun2(s1, n));
	}

	
}
