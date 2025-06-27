package ch05;

public class GUGUDAN {

	public static void main(String[] args) {
		printGGD(2);
		printGGD(3);
		printGGD(4);
	}
	public static void printGGD(int n) {
		System.out.printf("%d 단 \n", n);
		for(int i = 1; i <=9;i++) {
			System.out.printf("\t");
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}
	}

}
