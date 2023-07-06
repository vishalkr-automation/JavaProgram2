package arrayLogicPrograms2;

import java.util.Arrays;

public class MakeAllArrayElementsEqual {

	//Ref - https://www.geeksforgeeks.org/make-all-array-elements-equal-by-repeatedly-replacing-largest-array-element-with-the-second-smallest-element/?ref=rp
	
	//Make all array elements equal by repeatedly replacing largest array element with the second smallest element
	
	// Function to count number of operations
	  // required to make all array elements equal
	  static int operation(int arr[], int n)
	  {
	 
	    // Initialize the val_count
	    // and operation_count by 0.
	    int val_count = 0, operation_count = 0;
	 
	    // Sort the array in ascending order.
	    Arrays.sort(arr);
	 
	    for (int i = 1; i < n; i++) {
	 
	      // Current element greater
	      // than the previous element
	      if (arr[i - 1] < arr[i]) {
	 
	        // If yes then update the
	        // val_count by 1.
	        val_count++;
	      }
	 
	      // Add the value_count in operation_count.
	      operation_count = operation_count + val_count;
	    }
	    // Return the operation_count
	    return operation_count;
	  }
	 
	  // Driver Code
	  public static void main (String[] args)
	  {
	 
	    // Given Input
	    int arr[] = { 1, 1, 2, 2, 3 };
	    int n = arr.length;
	 
	    // Function Call
	    System.out.println( operation(arr, n));
	  }
}
