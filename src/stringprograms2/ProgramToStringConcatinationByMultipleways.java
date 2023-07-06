package stringprograms2;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ProgramToStringConcatinationByMultipleways {
	
	@Test
	 public static void f1(){   
		 //By Using + Operator
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
	 }  
	
	@Test
	 public static void f2(){   
		 //By Using Concat Method
		   String s1="Sachin ";  
		   String s2="Tendulkar";  
		   String s3=s1.concat(s2);  
		   System.out.println(s3);//Sachin Tendulkar   
	 }  
	
	@Test
	 public static void f3(){   
		 //By Using append Method of String Builder Class
			StringBuilder s1 = new StringBuilder("Hello"); // String 1
			StringBuilder s2 = new StringBuilder(" World"); // String 2
			StringBuilder s = s1.append(s2); // String 3 to store the result
			System.out.println(s.toString()); // Displays result  
	 }  
	
	@Test
	 public static void f4(){   
		 //By Using format method
			String s1 = new String("Hello"); // String 1
			String s2 = new String(" World"); // String 2
			String s = String.format("%s%s", s1, s2); // String 3 to store the result
			System.out.println(s.toString()); // Displays result
	 }  
	@Test
	 public static void f5(){   
		 //By Using join method
		//String concatenation using String.join() method (Java Version 8+)
			String s1 = new String("Hello"); // String 1
			String s2 = new String(" World"); // String 2
			String s = String.join("", s1, s2); // String 3 to store the result
			System.out.println(s.toString()); // Displays result
	 }  
	@Test
	 public static void f6(){   
		 //By Using StringJoiner Class Constructor
		//String concatenation using StringJoiner class (Java Version 8+)
		 StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
	        s.add("Hello");    //String 1   
	        s.add("World");    //String 2  
	        System.out.println(s.toString());  //Displays result  
	 } 
	
	@Test
	 public static void f7(){   
		//String concatenation using Collectors.joining() method (Java (Java Version 8+)
		List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
	    String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  
	        System.out.println(str.toString());  //Displays result  abc, pqr, xyz
	 }  


}
