
public class NumberGame {
	
	public static void main(String[] args) {
		java.util.Scanner cin = new java.util.Scanner(System.in);
		int sum = 0, a = cin.nextInt();
		Integer[] arr = new Integer[a];
		for(int i = 0; i < a; i++) {
			arr[i] = cin.nextInt();
		}
		boolean ck = true;
		while(ck) {
			java.util.Arrays.sort(arr, java.util.Collections.reverseOrder());
			ck = false;
			for(int j = 1; j < a; j++) {
				if(arr[j-1] > arr[j]) {
					arr[j-1] = arr[j-1] - arr[j];
					ck = true;
				}
			}
		}
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		cin.close();
	}
}
