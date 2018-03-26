package femous;

public class Joy {
	
	public static void main(String[] args) {
		int[] arr = new int[100];
		boolean ck = true;
		int k = 0;
		for(int i = 2; i <= 100; i++) {
			for(int j = 2; j < Math.sqrt(i); j++) {
				if(i % j == 0) {
					ck = false;
					break;
				}
			}
			if(ck == true) {
				arr[k++] = i;
			}
			ck = true;
		}
		int sum = 0;
		System.out.print("1-100 all primes numbers : ");
		for(int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println("\nsum : " + sum);
	}
}
