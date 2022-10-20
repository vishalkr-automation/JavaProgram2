package dateTimePackgeByJavaTPoint;

import java.time.LocalDate;
import java.time.Year;

public class YearExmaple2 {

	public static void main(String[] args) {
		Year y=Year.of(2018);
		LocalDate d=y.atDay(120);
		
		System.out.println(d);

	}

}
