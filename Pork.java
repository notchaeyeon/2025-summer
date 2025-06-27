package ch03;

public class Pork {

	public static void main(String[] args) {
		int n = 3;
		int g = 180;
		double gk = 5.179;
		double result = calrorie(n, g, gk);
		System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal", n, result);

	}
	public static double calrorie(int n, int g, double gk) {
		return g * n * gk;
	}
}
