package dateTimePackgeByJavaTPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatter2 {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		String dateformat1=formatter.format(d);
		
		System.out.println("Date format with MM/dd/yyyy: "+ dateformat1);
		
		formatter=new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		String dateformat2=formatter.format(d);
		
		System.out.println("Date Format with dd/M/yyyy hh:mm:ss"+ dateformat2);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy");
		String dateformat3=formatter.format(d);
		System.out.println(dateformat3);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy zzzz");
		String dateformat4=formatter.format(d);
		System.out.println(dateformat4);
		
		formatter=new SimpleDateFormat("E, dd MM yyyy HH_mm_ss z");
		String dateformat5=formatter.format(d);
		System.out.println(dateformat5);

	}

}
