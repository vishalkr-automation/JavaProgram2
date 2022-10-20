package dateTimePackgeByJavaTPoint;

import java.util.Calendar;
import java.util.Date;

public class CalanderExample1 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		Date calendar1=calendar.getTime();
		System.out.println(calendar1);
		
		calendar.add(calendar.DATE, -15);
		System.out.println("15 Days ago: "+ calendar.getTime());
		
		calendar.add(calendar.MONTH, 4);
		System.out.println("4 Months Later: "+ calendar.getTime());
		

		System.out.println("At Present Calendar's Year: "+ calendar.get(calendar.YEAR));
		System.out.println("At Present Calendar's Month: "+ calendar.get(calendar.MONTH));
		
		
	}

}
