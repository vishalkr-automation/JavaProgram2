package arrayLogicProgram3;

//Ref - https://www.youtube.com/watch?v=i-GtTjsg8I0&list=PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=8


public class FindTheSmallestIntegerGreaterThan_N_thatDoesntContainTwoIdentical {

	public static int solution(int N) {
		N=N+1;
		
		while(true) {
			boolean flag=true;
			String s=Integer.toString(N);
			for(int i=0; i<s.length()-1; i++) {
				if(s.charAt(i)==s.charAt(i+1)) {
					flag=false;
					break;
				}
			}
			if(flag)
				return N;
			else
				N=N+1;
		}
	}
	
   public static void main(String[] args) {
	   
	  //int input=55;  //Output - 56
	  int input=98;    //Output - 98
	  
	  System.out.println("Next Number which doesn't contain two identical: "+ solution(input));
   }
}
