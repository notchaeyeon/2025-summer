package ch07;

public class Dog {
	String name;
	String breeds;
	int age;
	
	void wag() {
		System.out.printf("[%s] 살랑살랑~\n ", name);
	}
	
	void bark() {
		System.out.printf("[%s] 멍멍!\n", name);
	}
	
	void bark(int times) {
		String sound = "멍멍";
		System.out.printf("[%s] %s(%d)\n", name, sound, times);
	}

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "덕자";
		d1.breeds = "비숑";
		d1.age = 4;
		
		d2.name = "땡순";
		d2.breeds = "말티즈";
		d2.age = 10;
		
		System.out.printf("d1 => (%s, %s, %d세)\n", d1.name, d1.breeds, d1.age);
		System.out.printf("d2 => (%s, %s, %d세)\n", d2.name, d2.breeds, d2.age);
		
		d1.wag();
		d2.bark();
		d1.bark(3);

	}

}
