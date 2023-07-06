package programs3;

import org.testng.annotations.Test;

public class ProgramToFindFirstNonRepeatingCharacter {
	
	//Example Reference
	//https://www.youtube.com/watch?v=3_Cum8uFgcw&list=PLE9KxZsdDp30jMp5r5gWyhR2iUMUhCV_4
	
	public static char firstNonRepeating(String str) {
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		
		return '-';
	}
	
	@Test
	public void f() {
		String str="abacabad";
		System.out.println("First non repeating character is: "+ firstNonRepeating(str));
	}
	
	@Test
	public void f1() {
		String str="abacabac";
		System.out.println("First non repeating character is: "+ firstNonRepeating(str));
	}

}
