package stringprograms2;

public class StringConeversionByDifferentWays {

	public static void main(String[] args) {
		
		//Method 1 - toString() Method - Only Convert Object Type to String
		Integer i=10;
		String str=i.toString(); 
		System.out.println(str);
		
		
		//Method 2 - String.ValueOf() - method, which convert any data type to String Type
		boolean b=true;
		String str1=String.valueOf(b);
		System.out.println(str1);
		
		Float f=10.2f;
		String str3=String.valueOf(f);
		System.out.println(str3);
		
		
		//Method 3 - String.format() - Method
		int c=1012;
		String str4= String.format("%s",c); 
		System.out.println(str4);
		
		//Method - 4 - String concatination operator
		int d=12;
		String str5=d+"";
		System.out.println(str5);
		
		//Method 5 - Integer.toString() - Method 
		int e=10;
		String str7=Integer.toString(e);
		System.out.println(str7);
		

	}

}
