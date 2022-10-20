package dateTimePackgeByJavaTPoint;

import java.time.OffsetTime;

public class OffSetTimeExample2 {

	public static void main(String[] args) {

    OffsetTime offset=OffsetTime.now();
    
    int h=offset.getHour();
    
    System.out.println(h+ "Hour");

	}

}
