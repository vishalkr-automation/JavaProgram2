package arrayLogicPrograms2;

import java.util.Vector;

public class DivideArrayIntoTwoArraysWhichDoesNotContainAnyPairWithSumK {

	//Ref - https://www.geeksforgeeks.org/divide-array-into-two-arrays-which-does-not-contain-any-pair-with-sum-k/?ref=rp
	// Function to split the given
	// array into two separate arrays
	// satisfying given condition
	static void splitArray(int a[], int n,
	                       int k)
	{
	     
	    // Stores resultant arrays
	    Vector<Integer> first = new Vector<>();
	    Vector<Integer> second = new Vector<>();
	 
	    // Traverse the array
	    for(int i = 0; i < n; i++)
	    {
	         
	        // If a[i] is smaller than
	        // or equal to k/2
	        if (a[i] <= k / 2)
	            first.add(a[i]);
	        else
	            second.add(a[i]);
	    }
	  
	    // Print first array
	    for(int i = 0; i < first.size(); i++)
	    {
	        System.out.print(first.get(i) + " ");
	    }
	  
	    // Print second array
	    System.out.println();
	    for(int i = 0; i < second.size(); i++)
	    {
	        System.out.print(second.get(i) + " ");
	    }
	}
	  
	// Driver Code
	public static void main(String[] args)
	{
	     
	    // Given K
	    int k = 5;
	  
	    // Given array
	    int a[] = { 0, 1, 3, 2, 4, 5,
	                6, 7, 8, 9, 10 };
	  
	    int n = a.length;
	     
	    splitArray(a, n, k);
	}
}
