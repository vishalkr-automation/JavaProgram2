package dateTimePackgeByJavaTPoint;

import java.time.Duration;
import java.time.Instant;

public class InstantExample3 {

	public static void main(String[] args) {
		Instant inst=Instant.parse("2017-02-03T02:37:09.00Z");
		inst=inst.minus(Duration.ofDays(125));
		
		System.out.println(inst);

	}

}
