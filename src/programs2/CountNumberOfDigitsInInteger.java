  package programs2;

import org.testng.annotations.Test;

public class CountNumberOfDigitsInInteger {
	
	//https://www.programiz.com/java-programming/examples/digits-count

	@Test
	public void f() {
		int count = 0, num = 3452;
        while(num != 0)
        {
            num = num/10;
            //num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

	}

	@Test(enabled=true)
	public void f1() {
		int count = 0, num = 3452;
       
        for(int i=num; i>=0; i--){
        	num=num/10;
        	i=num;
        	
        	count++;
        }
        System.out.println("Number of digits: " + count);

	}

	
	
	
}
