package programs3;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ProgramToFindFirstNonRepeatingCharacter2 {
	
	//Example Reference
	//https://www.youtube.com/watch?v=3_Cum8uFgcw&list=PLE9KxZsdDp30jMp5r5gWyhR2iUMUhCV_4
	
	public static char firstNonRepeating(String str) {
		Map<Character, Integer> countMap=new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}
			else {
				countMap.put(c, 1);
			}
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(countMap.get(ch)==1) {
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
