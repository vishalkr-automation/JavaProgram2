package dateTimePackgeByJavaTPoint;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample2 {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		int date=calendar.getMaximum(calendar.DAY_OF_WEEK);
		System.out.println("Maxiumum Day in a week: "+ date);
		
		int date2=calendar.getMaximum(calendar.WEEK_OF_YEAR);
		System.out.println("Maximum Week of this current Year: "+ date2);
	}

}
