package ch04;

public class OddOrEven {

	public static void main(String[] args) {
		printResult(13);
		printResult(6);
	}
	
	public static void printResult(int n) {
		String result = n%2==0 ? "짝수" : "홀수";
		System.out.printf("정수 %d는 %s입니다. \n", n, result);
	}

}
