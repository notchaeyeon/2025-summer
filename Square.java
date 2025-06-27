package ch03;

public class Square {

	public static void main(String[] args) {
		int length = 4;
		int result = square(length);
		System.out.println(result);
	}
	
	public static int square(int length){
		return length * length;
		
	}
}
