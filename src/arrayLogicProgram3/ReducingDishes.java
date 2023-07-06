package arrayLogicProgram3;

import java.util.ArrayList;

/*
 * Ref - https://www.youtube.com/watch?v=C4sQ48CIQgA&list=
 * PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=4
 * 
 * https://leetcode.com/problems/reducing-dishes/
 * 
 * A chef has collected data on the satisfaction level of his n dishes. Chef can
 * cook any dish in 1 unit of time.
 * 
 * Like-time coefficient of a dish is defined as the time taken to cook that
 * dish including previous dishes multiplied by its satisfaction level i.e.
 * time[i] * satisfaction[i].
 * 
 * Return the maximum sum of like-time coefficient that the chef can obtain
 * after dishes preparation.
 * 
 * Dishes can be prepared in any order and the chef can discard some dishes to
 * get this maximum value.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: satisfaction = [-1,-8,0,5,-9] Output: 14 Explanation: After Removing
 * the second and last dish, the maximum total like-time coefficient will be
 * equal to (-1*1 + 0*2 + 5*3 = 14). Each dish is prepared in one unit of time.
 * Example 2:
 * 
 * Input: satisfaction = [4,3,2] Output: 20 Explanation: Dishes can be prepared
 * in any order, (2*1 + 3*2 + 4*3 = 20) Example 3:
 * 
 * Input: satisfaction = [-1,-4,-5] Output: 0 Explanation: People do not like
 * the dishes. No dish is prepared.
 * 
 */

public class ReducingDishes {

		public static int solution(int[] array) {
			//make all the possible sub arrays
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
			
			//Multiply each array element with with their number of position and find the max possible value
			int max=Integer.MIN_VALUE;
			for(ArrayList<Integer> inner:subrArray) {
				int sum=0;
				for(int i=0; i<inner.size(); i++) {
					sum=sum+inner.get(i)*(i+1);
				}
				max=Math.max(max, sum);
			}
			
			return max;
		}

	public static void main(String[] args) {
		
		int x=ReducingDishes.solution(new int[] {-1,3,4});
		System.out.println(x);

	}

}
