package trickyPrograms;

import java.util.Scanner;

public class AddTwoNumbersWithotPlusOerator {
	
	public static void main(String[] args) {

        // reading input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = scanner.nextInt();

        // summing two numbers
        int output = num1 -(- num2);

        System.out.println("sum is: "+output);

    }

}
