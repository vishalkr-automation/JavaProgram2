package arrayLogicProgram3;

import java.util.ArrayList;

//Reference - https://www.youtube.com/watch?v=BsuzmrBxUcM&list=PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=7

public class ProgramToPrintPossibleSubArrayFromArray {
	
	public static ArrayList<ArrayList<Integer>> solution(int[] array) {
		ArrayList<ArrayList<Integer>> subrArray=new ArrayList<>();
		
		for(int i=0; i<(1<<array.length); i++) {
			ArrayList<Integer> inner=new ArrayList<>();
			
			for(int j=0; j<array.length; j++) {
				if((i &(1<<j))>0) {
					inner.add(array[j]);
				}
			}
			
			subrArray.add(inner);
		}
		return subrArray;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1,2,3}));
   
	}

}
