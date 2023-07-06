package arrayLogicalPrograms;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/

/*/
 Time Complexity: O(N), Only two traversals are needed.
Auxiliary Space: O(1), No extra space is needed

Smallest positive number missing from an unsorted array using Sorting:
The idea is to sort the array and then check for the smallest missing number (start from 1) if it is present then increment it.

Follow the steps below to solve the problem:

First sort the array and the smallest positive integer is 1.
So, take ans=1 and iterate over the array once and check whether arr[i] = ans (Checking for value from 1 up to the missing number).
By iterating if that condition meets where arr[i] = ans then increment ans by 1 and again check for the same condition until the size of the array.
After one scan of the array, the missing number is stored in ans variable.
Now return that ans to the function.
Below is the implementation of the above approach:
 */
public class SmallestPositiveNumberMissingFomanunSortedArray2 {
	
	public static int firstMissingPositive(int[] nums, int n) {
		Arrays.sort(nums);
		
		int ans = 1;
		for (int i = 0; i < n; i++) {
			if (nums[i] == ans)
				ans++;
		}
		return ans;
	}

	public static void main(String[] args) {
//		int arr[] = { 0, 10, 2, -10, -20 };  //output will be 1
		int arr[] = { 2, 3, -7, 6, 8, 1, -10, 15 };  //output will be 4
		int n = arr.length;
		int ans = firstMissingPositive(arr, n);
		System.out.println(ans);
	}

}
