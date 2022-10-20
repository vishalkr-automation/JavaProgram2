package programs2;

import org.testng.annotations.Test;

public class ProgramToCheckAlphabetVowelOrConsonant {

	@Test(enabled=false)
	public void f(){
		char ch = 'i';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
	}
	
	
	@Test(enabled=true)
	public void f1(){
		 char ch = 'z';
	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }
	}
	
	
	

}
