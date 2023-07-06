package arrayLogicProgram3;

public class LongestPrefixIndexThatContainsSameNumberOf_X_And_Y_in_An_Array {
	
	/*
	 https://www.careercup.com/question?id=6194336212451328
	 
	 Question 1:
	 Given two positive integers X and Y, and an array arr[] of positive integers. We need to find the longest prefix index which contains an equal number of X and Y. 
	 Print the maximum index of largest prefix if exist otherwise print -1.

    We start from the index 0 and run a loop till the end of array. We keep increasing counters for both numbers X and Y. 
    After iterating over the whole array, the last index when counts of X and y were equal is our result.
    
    Question 1:
    Jacob and Peter have their favorite number X and Y. We have given an array with positive interger number and we need to find the longest prefix index which contain equal number of X and Y. 
    return -1 if there is no prefix with equal number of X and Y.
	
	 Suppose we have an array A = [7,42,5,6,42,8,7,5,3,6,7]
     X = 7
     Y =42
    Output should be 9 as prefix will be index from 0 to 9 with equal number of X and Y.
    
  Reference video -   https://www.youtube.com/watch?v=Qe-idxVmIg8
    
	 */

	public static int findIndex(int arr[], int X, int Y, int n)

	{
		// counters for X and Y

		int nx = 0, ny = 0;
		int result = -1;

		for (int i = 0; i < n; i++)

		{
			// If value is equal to X increment counter of X
			if (arr[i] == X)

				nx++;
			// If value is equal to X increment counter of X

			if (arr[i] == Y)

				ny++;
			// If counters are equal(but not zero) save

			// the result as i

			if ((nx == ny) && (nx != 0 && ny != 0))
				result = i;
		}
		return result;
	}
	
	public static void main(String args[]) {
		//int[] arr = {7,42,5,6,42,8,7,5,3,6,7};
		int[] arr = {7,6,42,5,42,8,7,5,3,7};
		int n=arr.length;
		int  X = 7;
	    int Y =42;
		
	    System.out.println("The longest prefix index number is: "+ findIndex(arr, X, Y, n));  //output will be 9
		
	}
}
