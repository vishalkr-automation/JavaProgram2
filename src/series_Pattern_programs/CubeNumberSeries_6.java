package series_Pattern_programs;

/**  Print Cube Number Series from 1 tom 10 digit
 Output:  1 8 27 64 125 216 343 512 729 1000
     
     */

public class CubeNumberSeries_6 {
	
	public static void main(String[] args){
		int n=10;
		
		for(int i=1; i<=n; i++){
			System.out.print(" "+ (i*i*i));
		}
	}

}
