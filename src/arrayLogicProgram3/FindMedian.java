package arrayLogicProgram3;

import java.util.Arrays;

//https://www.geeksforgeeks.org/median/

public class FindMedian {

	// Function for calculating median
    public static double findMedian(int a[], int n)
    {
 
        // First we sort the array
        Arrays.sort(a);
       
        // Check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
 
    // Driver program
    public static void main(String args[])
    {
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
       // int a[] = { 1, 3, 4, 2, 7, 5, 8, 6,1 };
        int n = a.length;
        System.out.println("Median = " + findMedian(a, n));
    }
}
