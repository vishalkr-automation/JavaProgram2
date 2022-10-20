package cloneExample;



public  class TestClass implements Cloneable{
	
	int rollno;  
	String name;  
	  
	TestClass(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}    
	  
	public static void main(String args[]){  
	try{  
	TestClass s1=new TestClass(101,"amit");  
	  
	TestClass s2=(TestClass)s1.clone();  
	  
	System.out.println(s1.rollno+" "+s1.name);  
	System.out.println(s2.rollno+" "+s2.name);  
	  
	}catch(CloneNotSupportedException c){} 
	
	
	}
	
}
