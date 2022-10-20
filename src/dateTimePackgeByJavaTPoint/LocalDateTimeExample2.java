package dateTimePackgeByJavaTPoint;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample2 {

	public static void main(String[] args) {
   LocalDateTime datetime = LocalDateTime.of(2017, 12, 20, 10, 30);
   
   LocalDateTime datetime2=datetime.minusDays(10);
   System.out.println("Before Formatting: "+ datetime2);
   
   DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
   String formatDateTime=datetime2.format(format);
   
   System.out.println("After Formatting: "+ formatDateTime);
   
   
    
    

	}

}
