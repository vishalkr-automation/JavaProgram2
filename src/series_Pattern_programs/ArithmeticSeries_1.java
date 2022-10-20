package series_Pattern_programs;

/** 
 If a sequence of values follow a patetrn of adding a fixed amount from one term to next, It is referred
 to as an artithmetic series. 
 The number added to each term is constant is called as the common difference, d.
 E.g -  1, 4, 7, 10, 13, 16.....
 
 An arithmetic sequnce starts with term (a) 1 and common difference (d) of 3. 
 
 */

public class ArithmeticSeries_1 {
	
	
	public static void main(String[] args) {

		int n=5; //limit
		int d=3; // Common diffrence
		int a=2;
		
		for(int i=1; i<=n; i++){
			System.out.print(" "+ a);
			a=a+d;  //adding diff with term
		}
    

	}

}
