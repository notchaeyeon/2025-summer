package ch09;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Chae");
		names.add("Yeon");
		names.add("Park");
		names.add("Kim");
		
		names.set(0, "Lee");
		String remove = names.remove(1);
		
		for(int i =0;i<names.size();i++) {
			System.out.printf("%s \n", names.get(i));
		}
	}

}
