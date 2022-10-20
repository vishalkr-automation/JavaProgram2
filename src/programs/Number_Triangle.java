package programs;
import java.util.Scanner;
//Write a program to generate a number triangle
public class Number_Triangle {

	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter num: ");
		num=scan.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(1);
			}
			System.out.print("\n");
		}
	}

}
