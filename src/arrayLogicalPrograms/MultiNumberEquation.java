package arrayLogicalPrograms;

public class MultiNumberEquation {
	
	/*How many will be combination of X,Y,Z that will make it 79
	Example - 3x+9y+8z=79
	          
	          3*0+ 9*7+ 8*2=79   -> x=0, y=7,z=2
	*/
	
	public static void multiNumberEquation(int n) {
		System.out.println(" Execution started");
		
			for(int x=0; x<n; x++) {
				
				for(int y=0; y<n; y++) {
					
					for(int z=0; z<n; z++) {
					
						if(3*x+9*y+8*z==79) {
							System.out.println(x+","+y+","+z);
						}
					}
					
					
				}
				
			}
	}

	
 public static void main(String[] args) {
	 multiNumberEquation(10);  //What will be possible combination will be made for digit of 10 it will print
 }
 
}
