package StringPrograms5;

public class ProgramToDisplayAllAlphabetsFromAToZInUppercaseAndLowercaseBoth {

	//https://www.geeksforgeeks.org/program-to-display-all-alphabets-from-a-to-z-in-uppercase-and-lowercase-both/?ref=rp
	
	 private int ch;
	  
	    void uppercaseAlphabets()
	    {
	  
	        // uppercase
	        for (int c = 65; c <= 90; ++c)
	            System.out.print(" " + c);
	  
	        System.out.print("\n");
	    }
	    void lowercaseAlphabets()
	    {
	  
	        // lowercase
	        for (int c = 97; c <= 122; ++c)
	            System.out.print(" " + c);
	  
	        System.out.print("\n");
	    }
	  
	    // Driver program
	    public static void main(String[] args)
	    {
	        int ch;
	        System.out.println("Uppercase Alphabets");
	        ProgramToDisplayAllAlphabetsFromAToZInUppercaseAndLowercaseBoth ob = new ProgramToDisplayAllAlphabetsFromAToZInUppercaseAndLowercaseBoth();
	        ob.uppercaseAlphabets();
	  
	        System.out.println("Lowercase Alphabets ");
	        ob.lowercaseAlphabets();
	    }
}
