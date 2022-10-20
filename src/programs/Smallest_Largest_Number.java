package programs;

// write a program to find smaller and larger number in an array
public class Smallest_Largest_Number {

	public static void main(String[] args) {
		//declare and initialize an array 
		int numArray[]=new int[]{55,65,45,95,75,3};
		
		//declare and initialize two variables
		int smallNo=numArray[0];
		int largeNo=numArray[0];
		
		for(int i=1; i<numArray.length; i++){
			if(numArray[i]>largeNo)
				largeNo=numArray[i];
			else if(numArray[i]<smallNo)
				smallNo=numArray[i];	
		}
       System.out.println("Larget Number is: "+largeNo);
       System.out.println("Smallest Number is: "+smallNo);
	}

}
