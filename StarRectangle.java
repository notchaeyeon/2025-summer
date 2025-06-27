package ch05;

public class StarRectangle {

	public static void main(String[] args) {
		star(3, 7);
	}
	public static void star(int column, int row) {
		for(int i = 0 ; i < column ; i++) {
			for(int j = 0 ; j < row; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
