package dateTimePackage;

import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		String str=String.format("Current Date and Time: %tc", d);
		
		System.out.println(str);
		
		
		String str2=String.format("c");
		
		System.out.println(str2);

	}

}
