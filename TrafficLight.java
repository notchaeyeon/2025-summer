package ch04;

public class TrafficLight {

	public static void main(String[] args) {
		light("RED");
		light("YELLOW");
		light("GREEN");
		light("ORANGE");
		
	}
	public static void light(String color) {
		if(color == "RED") {
			System.out.println("빨간불이 켜집니다.");
		} else if(color == "YELLOW") {
			System.out.println("노란불이 켜집니다.");
		} else if(color == "GREEN") {
			System.out.println("초록불이 켜집니다.");
		} else {
			System.out.printf("에러, 잘못된 색 입력: %s \n", color);
		}
		
	}
	

}
