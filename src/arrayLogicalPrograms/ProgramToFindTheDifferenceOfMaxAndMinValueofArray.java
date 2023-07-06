package arrayLogicalPrograms;

public class ProgramToFindTheDifferenceOfMaxAndMinValueofArray {

	public static int solution(int[] array) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {

				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		return Math.abs(max-min);
	}
	
	public static int solution2(int[] array) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<array.length; i++) {
			max=Math.max(max, array[i]);
			min=Math.min(min, array[i]);
		}
		return Math.abs(max-min);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,-7,8,18,-6,5};
		
		System.out.println("Diff b/w max and min: "+ solution(arr));
		
		System.out.println("Diff b/w max and min: "+ solution2(arr));
		
	}

}
