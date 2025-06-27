package ch05;

public class StarRightTriangle {

	public static void main(String[] args) {
		star(5);
	}

//	public static void star(int n) {
//
//		for(int i = 0;i < n;i++) {
//			
//			for(int j = 0; j <= i;j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}

	public static void star(int n) {
		int i = 0;
		
		while(i<n) {
			
			int j = 0;
			
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			
			System.out.println();
			i++;
		}
	
	}
}
