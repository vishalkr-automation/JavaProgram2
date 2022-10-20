package series_Pattern_programs;

/**
The sequence which is generated from a pattern of dots which form a triangle is known as Triangular Number sequence
Rule: xn = n(n+1)/2

output:  1 3 6 10 15
 
*/

public class TriangularNumberSeries {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1; i<=n; i++){
			int num=(i*(i+1))/2;     //Formula of create triangular number
			System.out.print(" "+num);
		}

	}

}
