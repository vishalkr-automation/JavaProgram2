package stringprograms2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicateChractersFromAString {

	@Test(enabled=true)
	public void findIt() {  
		String str="IndiaIIIis my country";
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
    }  
	
	
}
