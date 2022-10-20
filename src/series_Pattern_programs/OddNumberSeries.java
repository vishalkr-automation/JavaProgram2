package series_Pattern_programs;

/**  Print ODD Number Series from 1 tom 10 digit
 Output: 1 3 5 7 9 11 13 15 17 19
     
     */

public class OddNumberSeries {
	
	public static void main(String[] args){
		int n=10;
		
		for(int i=1; i<=n; i++){
			System.out.print(" "+ (2*i-1));
		}
	}

}
