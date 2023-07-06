package programs4;
/*
 A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions is equal to the number itself.

For example, 175 is a Disarium number as follows

1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175
Some of the other examples of Disarium number are 89, 135, 518 etc.

To find whether given number is Disarium or not, calculate the sum of digits powered with their respective positions.
 If the sum is equal to the original number then, the given number is Disarium number.
 */


public class ProframToCheckDisariumNumber {

	//calculateLength() will count the digits present in a number  
    public static int calculateLength(int n){  
        int length = 0;  
        while(n != 0){  
            length = length + 1;  
            n = n/10;  
        }  
        return length;  
    }  
      
    public static void main(String[] args) {  
        int num = 175;
        int sum = 0;
        int remainder = 0; 
        int length = calculateLength(num);  
          
        //Makes a copy of the original number num  
       int n = num;  
          
        //Calculates the sum of digits powered with their respective position  
        while(num > 0){  
        	remainder = num%10;  
            sum = sum + (int)Math.pow(remainder,length);  
            num = num/10;  
            length--;  
        }  
          
        //Checks whether the sum is equal to the number itself  
        if(sum == n)  
            System.out.println(n + " is a disarium number");  
        else  
            System.out.println(n + " is not a disarium number");  
    }
}
