package programs3;

import java.util.Scanner;

/*
 Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.
  Given a number, check if it is a Strong Number or not.
  
Input  : n = 145
Output : Yes
Sum of digit factorials = 1! + 4! + 5!
                        = 1 + 24 + 120
                        = 145

Input :  n = 534
Output : No
 */

public class ProgramToFindStrongNumber {

	public static void main(String[] args) {
		
		int originalNum;
		int remainder;
		int fact;
		int sum=0;
       
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        
        int num=scan.nextInt();
        originalNum=num;
        
        while (num>0)//145>0  14>0 1>0
        {
        	remainder=num%10;
            
        	fact=1;
          
            for(int i=1;i<=remainder;i++){
                fact =fact*i;//fact=fact*i
            }
            sum =  sum + fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is STRONG NUMBER");
        } else {
            System.out.println(originalNum + " is not a STRONG NUMBER");
        }

	}

}
