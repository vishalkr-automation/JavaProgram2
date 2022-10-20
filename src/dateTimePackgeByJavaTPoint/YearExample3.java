package dateTimePackgeByJavaTPoint;

import java.time.Year;

public class YearExample3 {

	public static void main(String[] args) {
		Year y=Year.of(2018);
		int days=y.length();
		
		System.out.println(days);

	}

}
