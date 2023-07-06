package trickyPrograms;

public class ProgramToFindRemainderWithoutModuloOperator {
	
	// This function returns remainder of
    // num/divisor without using % (modulo)
    // operator
    static int getRemainder(int num, int divisor)
    {
        return (num - divisor * (num / divisor));
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
 
        // print 100 % 0;
        System.out.println(getRemainder(100, 7));
    }


}
