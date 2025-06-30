package ch06;

public class Ex6_3 {

	public static void main(String[] args) {
		int[] arr = {88, 76, 92, 68, 55, 48, 82};
		int sum = 0;
		
		// w/ for
//		for(int i = 0; i<arr.length;i++) {
//			sum+=arr[i];
//		}
		
		
		// w/o for
		sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4];
		sum += arr[5];
		sum += arr[6];

		
		System.out.printf("총합: %d", sum);
	}

}
