package programs2;

import org.testng.annotations.Test;

public class MultiplicationTable {

	@Test
	public void f1(){
		
		int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
        	int multiplication=num*i;
        	 System.out.println(num +" * "+ i +" : "+multiplication);
        }
		
		
	}
	
	
	@Test
	public void f2(){
		
		int num = 5, i=1;
        
		while(i<=10){
			int multiplication=num*i;
       	    System.out.println(num +" * "+ i +" : "+multiplication);
       	    
       	    i++;
		}
		
		
	}
}
