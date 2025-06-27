package ch02;

public class Converter {

	public static void main(String[] args) {
		double celsius;
		double fahrenheit = 77.0;
		
		celsius = (fahrenheit-32.0)/1.8;
				
		System.out.printf("화씨 %.1f는 섭씨로 %.1f도 입니다.", fahrenheit, celsius);
	}
}
