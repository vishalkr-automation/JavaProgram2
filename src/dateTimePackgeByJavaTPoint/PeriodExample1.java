package dateTimePackgeByJavaTPoint;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodExample1 {

	public static void main(String[] args) {
		Period p=Period.ofDays(24);
		
		Temporal temp=p.addTo(LocalDate.now());
		
		

	}

}
