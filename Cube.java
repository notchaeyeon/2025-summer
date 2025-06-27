package ch03;

public class Cube {

	public static void main(String[] args) {
		int length = 3;
		int result = v(length);
		System.out.printf("한 변의 길이가 %d인 정육면체의 부피: %d", length, result);
	}
	
	public static int v(int l) {
		return l*l*l;
	}

}
