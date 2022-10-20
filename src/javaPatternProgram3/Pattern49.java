package javaPatternProgram3;

public class Pattern49 {
	
/**Pattern Desgin is 
	
 7777777
 55555
  333
   1

*/

	public static void main(String[] args) {
	
		int p_height=4; //change value to increase or decrease the siz of the piramid
		
		int max_Stars=p_height*2-1;
		
		int p_space=p_height-1;
		
		for(int i=p_height; i>=1; i--){
			for(int j=p_space; j>=i; j--){
				System.out.print(" ");
			}
			
			for(int k=1; k<=max_Stars; k++){
				System.out.print(max_Stars);
			}
			
			max_Stars=max_Stars-2;
			System.out.println();
		}
		
		
	}

}
