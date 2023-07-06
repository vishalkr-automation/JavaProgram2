package arrayLogicalPrograms;

public class ProgramToPrintAlternateNumberInArray {

	public static void main(String[] args) {
		
/*
 *https://www.educative.io/answers/how-to-print-alternate-elements-of-an-array-in-java
 Time and space complexity
This solution takes O(n) time complexity, as we traverse elements in the array once.
O(1) space complexity, as we are not taking extra space to solve this problem aside from the input array.
		 */
		//Here are increasing i=i+2; -
		
		for(int i=1; i<=100; i=i+2) {
			System.out.print(i+" ");
		}
	}

}
