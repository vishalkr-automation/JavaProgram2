package programs4;

import java.util.Scanner;

/*
 Reference:-https://www.knowledgeboat.com/question/write-a-program-to-input-a-number-and-check-and-print-whether-it-is-a--12393456037186776
 Write a program to input a number and check and print whether it is a Pronic number or not. 
 [Pronic number is the number which is the product of two consecutive integers.]
Examples:
12 = 3 * (3+1)
20 = 4 * (4+1)
42 = 6 * (6+1)
 */

public class ProgramToCheckPronicNumber {

	public void pronicCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = scan.nextInt();
        
        boolean isPronic = false;
        
        for (int i = 1; i <= num - 1; i++) {
            if (i * (i + 1) == num) {
                isPronic = true;
                break;
            }
        }
        
        if (isPronic)
            System.out.println(num + " is a pronic number");
        else
            System.out.println(num + " is not a pronic number");
    }
}
