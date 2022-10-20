package stringprograms2;

import org.testng.annotations.Test;

public class DuplicateNumber {
	
	@Test(enabled = false)
	public void f() {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2,7};

		for (int i = 0; i < my_array.length; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if ((my_array[i] == my_array[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + my_array[j]);
				}
			}
		}
	}
	
	
	@Test(enabled = false)
	public void f1() {
		String str = "w3schools";

		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);

					break;
				}
			}
		}
	}
	

}
