package arrayLogicalPrograms;

public class Find_Maximum_Num_In_Array {
	
	public static void findmaxNum(int arry[]){
		int max=arry[0];
		
		for(int i=1; i<arry.length; i++){
			
			if(max<arry[i]){
				max=arry[i];
			}
		}
		
		System.out.println(max);
		
	}
	
	
	public static void main(String[] args){
		int a[]={33,3,4,5};//declaring and initializing an array  
		findmaxNum(a);//passing array to method  
	}

}
