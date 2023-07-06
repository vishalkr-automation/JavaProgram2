package stringprograms2;

import org.testng.annotations.Test;

public class HowManyTimes_T_Comes_OR_CountingFrequencyOfCharacters {

	@Test
	public void f(){
		String str = "Welcome to Javatpoint portal"; 
		int count = 0;
		for(int i=0; i<=str.length()-1; i++){
			if(str.charAt(i)=='t'){
				count++;
			}
		}
		
		System.out.println("Number of Times 'T' is available: "+ count);
	}
	
	@Test
	public void f1(){
		String str = "Welcome to JavaTpoint";
		int count = 0;
		int startFrom = 0;
		for (;;) {

			int index = str.indexOf('o', startFrom);

			if (index >= 0) {
				// match found. Hence, increment the count
				count = count + 1;

				// start looking after the searched index
				startFrom = index + 1;
			}

			else {
				// the value of index is - 1 here. Therefore, terminate the loop
				break;
			}

		}

		System.out.println("In the String: " + str);
		System.out.println("The 'o' character has come " + count + " times");
	}
}
