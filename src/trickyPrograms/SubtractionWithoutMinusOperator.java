package trickyPrograms;

import java.util.Scanner;

public class SubtractionWithoutMinusOperator {

	//Subtraction without - operator
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=scan.nextInt();
		
		System.out.println("Enter num2: ");
		int num2=scan.nextInt();

		int sub=num1+(~num2+1);
		System.out.println("After subtarcted:" + sub);
	}

}
