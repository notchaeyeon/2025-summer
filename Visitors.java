package ch06;

public class Visitors {

	public static void main(String[] args) {
		String[] city = {"서울", "부산", "인천", "대전", "대구"};
		int[] num = {599, 51, 46, 43, 27};
		
		for(int i = 0 ;i < 5; i++) {
			System.out.printf("%s: %d명 \n",city[i], num[i]);
		}
	}

}
