package dateTimePackgeByJavaTPoint;

import java.time.LocalDate;
import java.time.MonthDay;

public class MonthDayExample1 {

	public static void main(String[] args) {
		
		MonthDay month=MonthDay.now();
		
		LocalDate date=month.atYear(2019);
		
		System.out.println(date);

	}

}
