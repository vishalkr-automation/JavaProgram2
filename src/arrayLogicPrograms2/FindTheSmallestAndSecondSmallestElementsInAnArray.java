package arrayLogicPrograms2;

import java.util.Arrays;

public class FindTheSmallestAndSecondSmallestElementsInAnArray {

	//Ref - https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/?ref=rp
	
	// Driver Code
	public static void main(String args[])
	{
	    int arr[]={111, 13, 25, 9, 34, 1};
	    int n=arr.length;
	   
	    // sorting the array using
	    // in-built sort function
	    Arrays.sort(arr);
	   
	    // printing the desired element
	    System.out.println("smallest element is "+arr[0]);
	    System.out.println("second smallest element is "+arr[1]);
	}
}
