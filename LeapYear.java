package ch04;

public class LeapYear {

	public static void main(String[] args) {
		result(2020);
		result(1900);
		result(2000);
	}
	
	public static void result(int year) {
		boolean ans;
		
		if(year%4==0&&year%100!=0) {
			ans = true;
		} else if (year%1000 == 0) {
			ans = true;
		} else {
			ans = false;
		}
		
		System.out.printf("%d년은 윤년입니까? %b\n", year, ans);
	}
}
