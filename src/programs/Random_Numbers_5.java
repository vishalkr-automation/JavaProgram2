package programs;

//write a program to generate 5 Random Integer numbers between 1 to 50
public class Random_Numbers_5 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
			System.out.println((int)(Math.random()*50));
		}
	}

}
