package ch05;

public class iSum {

	public static void main(String[] args) {
		int s = 0; 
		int i = 0;
		
//		for(i = 1; i<=10;i++) {
//			s +=i;
//		}
//		
//		System.out.printf("총합: %d", s);
		
		while(i<=10) {
			s+= i;
			i++;
		}
		
		System.out.printf("총합: %d", s);

	}

}
