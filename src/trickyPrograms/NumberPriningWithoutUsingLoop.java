package trickyPrograms;

public class NumberPriningWithoutUsingLoop {
	
	 public static void main(String[] args)
	    {
	        printNos(1, 100);
	    }
	    public static void printNos(int initial, int last)
	    {
	        if (initial <= last) {
	            System.out.print(initial + " ");
	            printNos(initial + 1, last);
	        }
	    }

}
