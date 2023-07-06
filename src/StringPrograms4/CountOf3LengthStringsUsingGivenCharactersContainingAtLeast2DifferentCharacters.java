package StringPrograms4;

import java.util.Arrays;

public class CountOf3LengthStringsUsingGivenCharactersContainingAtLeast2DifferentCharacters {

	//https://www.geeksforgeeks.org/count-of-3-length-strings-using-given-characters-containing-at-least-2-different-characters/?ref=rp
	
	 // Function to count possible number of strings
    // such that each string consists of atleast
    // 2 different characters of length 3
    public static int countStrings(int a, int b, int c)
    {
       
        // Array to store the 3 frequencies
        int[] arr = new int[3];
 
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
 
        // Total number of strings that can be
        // formed irrespective of the given
        // condition i.e, neglecting the condition
        // that each string consists of atleast 2
        // different characters of length 3
        int count = (arr[0] + arr[1] + arr[2]) / 3;
 
        // Sort the array
        Arrays.sort(arr);
 
        // If the sum of smallest and 2nd largest
        // element is less than the count, then
        // assign the sum to count
        if (arr[0] + arr[1] < count) {
            count = arr[0] + arr[1];
        }
 
        // Return the count
        return count;
    }
 
    // Driver Code
    public static void main(String[] args) {
         
        int a = 5, b = 4, c = 3;
 
        System.out.println(countStrings(a, b, c));
    }
}
