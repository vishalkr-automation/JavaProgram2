package programs2;

import java.util.Scanner;

/**
 Sorting meanas arraning the contents in the regular fashion(increasing or decreasing). There are many sorting algorithms, you may
 use anoyone of them.
 This program uses the 'slection sort' technique.
 Note1: This program performs the array sorting in increasing order.If you want to sort the array in decreasing order, just replace the 
 Smaller-than operator(<) with the greater-than(>) in the if(arr[i]<arr[j]) of the sorting procedure.
 
 Ex: 1,15,18,3,21
 Sorting order - 1,3,15,18,21
  
 */

public class ArraySorting_decreasingOrder {

	public static void main(String[] args) {
		int arr[] =new int[5];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter elements of the array: ");
		for(int i=0; i<5; i++){
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Unsorted Element of the array: ");
		for(int i=0; i<5; i++){
			System.out.print(arr[i]+" ");
		}
		
		//Sorting procedure
		
		for(int i=0; i<5; i++){
			for(int j=i+1; j<5; j++){
				if(arr[i]<arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		//Sorting end
		
		System.out.println("\n\nSorted order of the array (decreasing Order): ");
		for(int i=0; i<5; i++){
			System.out.print(arr[i]+ " ");
		}

	}

}
