package ch03;

public class Cylinder {

	public static void main(String[] args) {
		double r = 7;
		double h = 5;
		double v = volume(r, h);
		
		System.out.printf("반지름이 %d, 높이가 %d인 원기둥의 부피: %.1f", (int)r, (int)h, v);
	}
	
	public static double volume(double r, double h) {
		return Math.PI * r * r * h;
	}

}
