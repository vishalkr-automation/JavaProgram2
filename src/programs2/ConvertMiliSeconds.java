package programs2;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class ConvertMiliSeconds {

	@Test
	public void f(){
		 long milliseconds = 1000000;
	        // long minutes = (milliseconds / 1000) / 60;
	        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
	        // long seconds = (milliseconds / 1000);
	        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
	       
	        System.out.println("Mintues: "+ minutes);
	        
	        System.out.println("Seconds: "+ seconds);
	}
}
