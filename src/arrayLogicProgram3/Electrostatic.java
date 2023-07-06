package arrayLogicProgram3;

//https://www.youtube.com/watch?v=1IaW47uB5mw&list=PLCxz_L6yihRnceAZqai6Q8YCFmJNqI7Ht&index=1

/*
 This is commonly asked question in many exam for freshers also and even after company internal exams. In this video, 
 I will show you how to solve a common coding problem using the Java programming language. You'll learn the key concepts and 
 see a step-by-step solution to help you understand the problem and develop your own solution. Whether you're a beginner or 
 an experienced programmer, 
 this video is a must-watch! Don't forget to like, comment, and subscribe for more coding tutorials and solutions."
 
 input1:{4,3,5}
 input2:PNP
 input3:3
 
 output:600
 
 input1:{2,3}
 input2:PN
 Input3:2
 
 Output:100
 
 4 3 5
 P N P
 (+4)+(-3)+(+5)=6*100
 
 2 3
 P N
 (+2)+(-3)=-1
 1*100
 
 */
public class Electrostatic {

	public int solution(int[] input1, String input2, int input3) {
		int sum=0;
		for(int i=0; i<input3; i++) {
			if(input2.charAt(i)=='P') {
				sum=sum+input1[i];
			}
			else {
				sum=sum-input1[i];
			}
		}
		return Math.abs(sum)*100;
	}
	
	public static void main(String[] args) {
		Electrostatic e=new Electrostatic();
		int x=e.solution(new int[] {4,3,5}, "PNP", 3);
		System.out.println(x);
	}
}
