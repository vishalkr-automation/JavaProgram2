package programs;

import java.util.Scanner;

//Java program to bubble sort: This code sorts numbers inputted by user using Bubble sort algorithm. 
public class BubbleSort {

	public static void main(String[] args) {
		int n,swap;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input number of integrs to sort");
		n=scan.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter "+ n +" Intgers");
		
		for(int i=0; i<n; i++){
			array[i]=scan.nextInt();
		}
		
		for(int i=0; i<(n-1); i++){
			for(int j=0; j<(n-i-1); j++){
				if(array[j]>array[j+1]){      /* For ascending order use < */
					swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}}}
		System.out.println("Sorted List of Numbers");
		for(int i=0; i<n; i++)
			System.out.println(array[i]);

	}

}
