package dateTimePackgeByJavaTPoint;

import java.time.LocalTime;

public class LocalTimeExample3 {

	public static void main(String[] args) {
		LocalTime time=LocalTime.of(10, 42, 53);
		
		System.out.println("Acutal Time: "+ time);
		
		LocalTime time2=time.minusHours(2);
		
		LocalTime time3=time2.minusMinutes(20);
		
		System.out.println("Hours: " + time3);

	}

}
