package programs;

// write a program to split a array string
public class String_Splits {

	public static void main(String[] args) {
		String str="one,two,three,four,five,six";
		String[] s1=str.split(",");
		for(int i=0; i<s1.length; i++){
			System.out.println(s1[i]);
		}
	}

}
