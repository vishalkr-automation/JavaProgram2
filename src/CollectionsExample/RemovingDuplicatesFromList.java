 package CollectionsExample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;


public class RemovingDuplicatesFromList{
	
public static void main(String args[]){
	List<String> al = new ArrayList<String>();
    al.add("Ajay");
    al.add("Becky");
    al.add("Chaitanya");
    al.add("Ajay");
    al.add("Rock");
    al.add("Becky");

    // Displaying ArrayList elements 
    System.out.println("Before:");
    System.out.println("ArrayList contains: "+al);

    // Creating LinkedHashSet
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();

    /* Adding ArrayList elements to the LinkedHashSet
     * in order to remove the duplicate elements and 
     * to preserve the insertion order.
     */
    lhs.addAll(al);
 
    // Removing ArrayList elements
    al.clear();

    // Adding LinkedHashSet elements to the ArrayList
    al.addAll(lhs);

    // Displaying ArrayList elements
    System.out.println("After:");
    System.out.println("ArrayList contains: "+al);
	
	
}


}