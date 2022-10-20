package series_Pattern_programs;

/** 
 The Fibonacci series is a series where the next term is the sum of pervious two terms. 
 The first two terms of the Fibonacci sequence is 0 followed by 1.
 0 1 1 2 3 5 8 13 21 ...
 */

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		
		int i = 1, n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        while (i <= n)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
            i++;
        }

	}

}
