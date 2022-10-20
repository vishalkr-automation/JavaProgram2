package inhertinaceExample_CovariantReturnType;

public class TestClass2 extends TestClass1{

	public Integer m(){
		return 10;
	}
	public static void main(String[] args) {
		
		TestClass1 t=new TestClass2();
		
	System.out.println(t.m());
	}

}
