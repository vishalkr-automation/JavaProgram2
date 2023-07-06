package programs3;

/*
 Happy Number - The happy number can be defined as a number which will yield 1 when it is replaced by the sum of the square of 
 its digits repeatedly. If this process results in an endless cycle of numbers containing 4, then the number is called an unhappy number.

For example, 32 is a happy number as the process yields 1 as follows

(3)^2 + (2)^2 = 13
(1)^2 + (3)^2 = 10
(1)^2 + (0)^2 = 1
Some of the other examples of happy numbers are 7, 28, 100, 320 and so on.

The unhappy number will result in a cycle of 4, 16, 37, 58, 89, 145, 42, 20, 4, ....
 */


public class ProgramToCheckHappyNumber {
	
	public static int isHappyNumber(int num){ 
	  int remainder = 0;
	 int sum = 0;  
      
      //Calculates the sum of squares of digits  
      while(num > 0){  
    	  remainder = num%10;  
          sum = sum + (remainder*remainder);  
          num = num/10;  
      }  
      return sum;  
  }  
    
  public static void main(String[] args) {  
      int num = 82;  
      int result = num;  
        
      while(result != 1 && result != 4){  
          result = isHappyNumber(result);  
      }  
        
      //Happy number always ends with 1  
      if(result == 1)  
          System.out.println(num + " is a happy number");  
      //Unhappy number ends in a cycle of repeating numbers which contains 4  
      else if(result == 4)  
          System.out.println(num + " is not a happy number");     
  }  


}
