package ch05;

public class WhileCountDown {

	public static void main(String[] args) {
		countDown(5);
	}

	public static void countDown(int n) {
		while(n>=0) {
			System.out.printf("%d.. \n",n);
			n--;
		}
		System.out.println("발사!!");
	}
}
