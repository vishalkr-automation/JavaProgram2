 package arrayLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Given an array of integers, find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order. 

Examples:  

Input: arr[] = {1, 9, 3, 10, 4, 20, 2}
Output: 4
Explanation: The subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements

Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
Output: 5
Explanation: The subsequence 36, 35, 33, 34, 32 is the longest subsequence of consecutive elements.

Naive Approach:
The idea is to first sort the array and find the longest subarray with consecutive elements. 
After sorting the array and removing the multiple occurrences of elements, run a loop and keep a count and max (both initially zero). 
Run a loop from start to end and if the current element is not equal to the previous (element+1) then set the count to 1 else increase 
the count. Update max with a maximum of count and max. 
 */

//https://www.geeksforgeeks.org/longest-consecutive-subsequence/

public class LongestConsecutiveSubsequenceInArray {

	 static int findLongestConseqSubseq(int arr[], int n)
	    {
	  
	        // Sort the array
	        Arrays.sort(arr);
	  
	        int ans = 0, count = 0;
	  
	        ArrayList<Integer> v = new ArrayList<Integer>();
	        v.add(arr[0]);
	  
	        //removing duplicates and insert in arraylist
	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[i - 1])
	                v.add(arr[i]);
	        }
	  
	        // Find the maximum length  by traversing the arraylist
	        for (int i = 0; i < v.size(); i++) {
	  
	            // Check if the current element is
	            // equal to previous element +1
	            if (i > 0 && v.get(i) == v.get(i - 1) + 1)
	                count++;
	            else
	                count = 1;
	  
	            // Update the maximum
	            ans = Math.max(ans, count);
	        }
	        return ans;
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
	        int n = arr.length;
	  
	        System.out.println(
	            "Length of the Longest "
	            + "contiguous subsequence is "
	            + findLongestConseqSubseq(arr, n));
	    }
	}

//Output - Length of the Longest contiguous subsequence is 4https://www.youtube.com/watch?v=e5kjjo0slrc&list=PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=3
