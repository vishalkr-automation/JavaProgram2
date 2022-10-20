package dateTimePackgeByJavaTPoint;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class MonthDayExample4 {

	public static void main(String[] args) {
		MonthDay month=MonthDay.now();
		
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);
		
		System.out.println("Month Range: "+ r1);
		
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);
		
		System.out.println("Day Range: "+ r2);
		
		

	}

}
