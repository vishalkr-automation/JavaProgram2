package dateTimePackgeByJavaTPoint;

import java.time.LocalTime;

public class LocalTimeExample4 {

	public static void main(String[] args) {
		LocalTime time=LocalTime.of(10, 21, 50);
		
		LocalTime time2=time.plusHours(2);
		
		LocalTime time3=time2.plusMinutes(2);
		
		System.out.println("Acutal Time: "+ time);
		
		System.out.println("After Change Time:"+ time3);

	}

}
