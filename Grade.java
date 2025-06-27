package ch04;

public class Grade {

	public static void main(String[] args) {
		printGrade(96);
		printGrade(86);
		printGrade(70);
		printGrade(55);
	}

	public static void printGrade(int score) {
		String result="";
		
		if(score>=90) {
			result = "A";
		}else if(score>=80) {
			result = "B";
		}else if(score>=70) {
			result = "C";
		}else {
			result = "F";
		}
		
		System.out.printf("%d점의 학점: %s \n", score, result);
		
	}
}
