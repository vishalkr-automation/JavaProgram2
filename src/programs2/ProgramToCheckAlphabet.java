package programs2;

import org.testng.annotations.Test;

public class ProgramToCheckAlphabet {
	
	@Test
	public void f1(){
		char c = '*';
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
	}
	
	
	
	@Test
	public void f2(){
       char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);	}

}
