package programs;

/** 
Prime number is a number that is greater than 1 and divided by 1 or itself only.
 In other words, prime numbers can't be divided by other numbers than itself or 1. 
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */
public class PrimeNumber_1_To_100 {

	public static void main(String[] args) {
		int num = 100;
       
        System.out.println("Prime numbers between 1 and 100");
       
        //loop through the numbers one by one
        for(int i=1; i < num; i++){
               
                boolean isPrime = true;
               
                //check to see if the number is prime
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.println(i);
        }
	}

}
