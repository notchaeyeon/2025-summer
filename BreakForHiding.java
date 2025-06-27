package ch05;

public class BreakForHiding {

	public static void main(String[] args) {
		printSum(1,10);

	}
	public static void printSum(int start, int end) {
		int s = 0;
		for(int i = start ; i<= end ;i++) {
			System.out.print(i);
			s += i; 
			if(i == end) break;
			System.out.print(" + ");
		}
		System.out.printf(" = %d",s);
	}
}
