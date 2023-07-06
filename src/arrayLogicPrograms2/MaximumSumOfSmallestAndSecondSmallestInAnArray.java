package arrayLogicPrograms2;

public class MaximumSumOfSmallestAndSecondSmallestInAnArray {

	//Ref - https://www.geeksforgeeks.org/maximum-sum-of-smallest-and-second-smallest-in-an-array/?ref=rp
	
	// Method returns maximum obtainable sum value
	// of smallest and the second smallest value
	// taken over all possible subarrays */
	static int pairWithMaxSum(int[] arr, int N)
	{
	if (N < 2)
	    return -1;
	 
	// Find two consecutive elements with maximum
	// sum.
	int res = arr[0] + arr[1];
	for (int i=1; i<N-1; i++)
	    res = Math.max(res, arr[i] + arr[i+1]);
	 
	return res;
	}
	 
	// Driver program
	public static void main(String[] args)
	{
	    int arr[] = {4, 3, 1, 5, 6};
	    int N = arr.length;
	    System.out.println(pairWithMaxSum(arr, N));
	}
	
}
