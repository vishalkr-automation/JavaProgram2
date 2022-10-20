package arrayLogicalPrograms;

public class Find_Minumum_Num_In_Array {
	
	public static void findminNum(int arry[]){
		int min=arry[0];
		
		for(int i=1; i<arry.length; i++){
			
			if(min>arry[i]){
				min=arry[i];
			}
		}
		
		System.out.println(min);
		
	}
	
	
	public static void main(String[] args){
		int a[]={33,3,4,5};//declaring and initializing an array  
		findminNum(a);//passing array to method  
	}

}
