package series_Pattern_programs;

import java.util.Scanner;

/** 
 If a sequence of values follow a patetrn of multiplying a fixed amount times each term to arrive at the following term, It is referred
 to as an geometric sequnce. 
 The number multiplied to each time is constant is called as the common ratio, r.
 E.g -  2, 6, 18, 54 .....
 
 An geometric sequnce starts with term (a) 2 and common ratio (r) of 3. 
 
 */

public class GeometricSeries_1 {

	public static void main(String[] args) {

		int a = 2;

		int n = 5;

		int r = 3;

		for (int i = 1; i <= n; i++) {
			System.out.print(" " + a);
			a = a * r; // adding ratio with term
		}

	}

}
