package dateTimePackgeByJavaTPoint;

import java.util.TimeZone;

public class TimeZoneExample1 {

	public static void main(String[] args) {
		
		String[] id=TimeZone.getAvailableIDs();
		System.out.println("In TimeZone Class availbale ID are: ");
		for(int i=0; i<=id.length; i++){
			int size=id.length;
			System.out.println(size);
			System.out.println(id[i]);
		}

	}

}
