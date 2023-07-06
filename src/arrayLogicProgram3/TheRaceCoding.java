package arrayLogicProgram3;

//https://www.youtube.com/watch?v=hNwrdu7wfzk&list=PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=2

public class TheRaceCoding {

	public int solution(int[][] input2) {
		int x=0;
		int max=0;
		
		while(x!=Integer.MAX_VALUE) {
			int count=0;
			for(int[] inner:input2) {
				if(x > inner[0] && x <= inner[1]) {
					count++;
				}
				max=Math.max(max, count);
				x++;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		TheRaceCoding t=new TheRaceCoding();
		
		int x=t.solution(new int[][] {{1,7},{2,4},{6,9},{3,8},{5,10}});
		
		System.out.println(x);
	}
}
