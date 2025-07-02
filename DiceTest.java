package ch09;
import java.util.Random;
import java.util.Scanner;

public class DiceTest {

	public static void main(String[] args) {
		Dice diceA = new Dice(6);
		Dice diceB = new Dice(6);
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("주사위를 몇 회 굴릴까욥?");
		int n = input.nextInt();
	
		int[] count = new int[13];
		
		for(int i = 0;i<n;i++) {
			int sum = 0;
			a = diceA.roll();
			b = diceB.roll();
			sum = a + b;
			
			// 모범답안 *^^*			
			count[sum]++;
			
			// 내가 한 멍청 코드 
/*			if(sum == 2) count[2]++;
			else if (sum == 3) count[3]++;
			else if (sum == 4) count[4]++;
			else if (sum == 5) count[5]++;
			else if (sum == 6) count[6]++;
			else if (sum == 7) count[7]++;
			else if (sum == 8) count[8]++;
			else if (sum == 9) count[9]++;
			else if (sum == 10) count[10]++;
			else if (sum == 11) count[11]++;
			else if (sum == 12) count[12]++; */
		}
		

		for(int i = 2;i<10;i++) {
			System.out.printf(" %d: ", i);
			for(int j = 0; j<count[i];j++ ) {
				System.out.printf("#");		
			}
			System.out.println();
		}
		for(int i = 10;i<13;i++) {
			System.out.printf("%d: ", i);
			for(int j = 0; j<count[i];j++ ) {
				System.out.printf("#");		
			}
			System.out.println();
		}
				
		
	}
}

class Dice {
	private int sides; 
	private static Random rand = new Random(); 

	public Dice(int _sides) {
		sides = _sides;
	}

	public int roll() {
		return rand.nextInt(sides) + 1; 

	}

}
