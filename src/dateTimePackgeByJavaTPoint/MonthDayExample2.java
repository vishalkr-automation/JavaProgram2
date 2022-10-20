package dateTimePackgeByJavaTPoint;

import java.time.MonthDay;

public class MonthDayExample2 {

	public static void main(String[] args) {


		MonthDay month=MonthDay.now();
		
		boolean b=month.isValidYear(2021);
		System.out.println(b);
		
		
	}

}
