package dateTimePackgeByJavaTPoint;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample1 {

	public static void main(String[] args) {
		LocalDateTime time=LocalDateTime.now();
		
		System.out.println("Before formatting: "+ time);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatDateTime=time.format(format);
		
		System.out.println("After Formatting: "+  formatDateTime);
		
		

	}

}
