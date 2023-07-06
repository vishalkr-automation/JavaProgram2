package arrayLogicalPrograms;

import java.util.ArrayList;

public class PrgramToFindOddNumberInReverseOrderAndPrintAlternateNumber {

	public static void main(String[] args) {
		int num=100;
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=100; i>=1; i--) {
			if(i%2!=0) {
				System.out.print(i + " ");
				//Store all odd element in ArrayList
				list.add(i);
			}
		}

		System.out.println();
		
		//Fetch odd number from arraylist and print only alternate number after increasing j=j+2
		for(int j=0; j<list.size(); j=j+2) {
			System.out.print(list.get(j)+" ");
		}
	}

}
