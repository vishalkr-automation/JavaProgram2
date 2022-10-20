package javaPatternPrograms;

public class Pattern28 {
	
	//Method 1
	public static void method1() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char) (k + 65));
			}

			System.out.println();
		}

	}
	
	//Method 2
	public static void method2() {
		int n = 5;
		for (char i = 'A'; i <= 'E'; i++) {
			int p = 1;

			for (int j = n - 1; j >= p; j--) {
				System.out.print(" ");
			}

			for (char k = 'A'; k <= i; k++) {
				System.out.print(k);
			}

			System.out.println();
			p++;
			n--;

		}

	}
	
public static void main(String[] args) {
	method1();	

}
}