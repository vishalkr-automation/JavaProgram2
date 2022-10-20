package CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class MixStringWithIntgerUsingList {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("Mohan");

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);

		List<List> listOfMixedTypes = new ArrayList<List>();
		listOfMixedTypes.add(al);
		listOfMixedTypes.add(al2);

		Iterator<List> itr = listOfMixedTypes.iterator();
		
		while (itr.hasNext()) {
			List str = itr.next();
			System.out.println(str.get(0));
		}

	}
	
}
