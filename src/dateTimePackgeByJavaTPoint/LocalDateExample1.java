package dateTimePackgeByJavaTPoint;

import java.time.LocalDate;

public class LocalDateExample1 {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=date.plusDays(1);
		
		System.out.println("Today's Date: "+ date);
		System.out.println("Yesterday's Date: "+ yesterday);
		System.out.println("Tomorrow's Date: "+ tomorrow);

	}

}
