package arrayLogicPrograms2;

public class CountPairsInAnArrayContainingAtLeastOneEvenValue {

	//https://www.geeksforgeeks.org/count-pairs-in-an-array-containing-at-least-one-even-value/?ref=rp
	
	 // Function to count the pairs in
    // the array such as there is at
    // least one even element in each pair
    static int CountPairs(int[] arr, int n)
    {
 
        int count = 0;
 
        // Generate all possible pairs
        // and increment then count
        // if the condition is satisfied
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
 
                if (arr[i] % 2 == 0
                    || arr[j] % 2 == 0)
                    count++;
            }
        }
 
        return count;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int[] arr = { 8, 2, 3, 1, 4, 2 };
        int n = arr.length;
 
        // Function Call
        System.out.println(CountPairs(arr, n));
    }
	
}
