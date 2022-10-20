package dateTimePackage;

import java.text.SimpleDateFormat;
import java.util.Date;



public class DateDemo1 {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
		Date date=new Date();
		
		String str=simpleDateFormat.format(date);
		
		System.out.println(str);

	}

}
