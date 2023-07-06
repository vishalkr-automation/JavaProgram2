package practice;

public class Test2 extends Test1{

	public void run() {
		super.run();
		System.out.println("Child");
	}
	{
	run();
	}
	
	public static void main(String...arg) {
		Test2 t2=new Test2();
		t2.run();
		
		Test1 t1=new Test2();
		t1.run();
		
		Test1 t11=new Test1();
		t11.run();
	}
}
