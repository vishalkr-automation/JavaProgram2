package CollectionsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Howtoconvertan_arrayto_ArrayList {
	
/*
    Method 1 - Method 1: Conversion using Arrays.asList()
	Syntax: ArrayList<T> arraylist= new ArrayList<T>(Arrays.asList(arrayname));
*/
	public static void method1(){
		 /* Array Declaration and initialization*/
		  String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

		  /*Adding new elements to the converted List*/
		  citylist.add("New City2");
		  citylist.add("New City3");

		  /*Final ArrayList content display using for*/
		  for (String str: citylist)
		  {
			System.out.println(str);
	       	  }
	}

/*
    Method 2 - Collections.addAll(arraylist, array);
*/
	public static void method2(){
		 /* Array Declaration and initialization*/
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Conversion*/
	    Collections.addAll(arraylist, array);

	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");

	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	}
	
	
/*
   Manual way of doing things
   We can also add all the array’s element to the array list manually. Below example shows the logic of manual conversion.
*/
	public static void method3(){
		 /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Initialized Array*/
	    String array[] = {"Text1","Text2","Text3","Text4"};   

	    /*array.length returns the current number of 
	     * elements present in array*/
	    for(int i =0;i<array.length;i++)
            {

	         /* We are adding each array's element to the ArrayList*/
		 arraylist.add(array[i]);
	    }

	    /*ArrayList content*/
	    for(String str: arraylist)
	    {
	         System.out.println(str);
	    }
}
	
}
