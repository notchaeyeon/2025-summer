package ch08;

public class StudentTest {

	public static void main(String[] args) {
		Student park = new Student(201922104,"park");
		Student kim = new Student(2019206028, "kim");
		Student lee = new Student(2019153237, "lee");
		
		System.out.printf("Student 객체의 수: %d", Student.count);
	}

}

class Student{
	
	static int count = 0;
	
	int id;
	String name;
	
	Student(int _id, String _name){
		
		Student.count++;
		id = _id;
		name = _name;
	}
}
