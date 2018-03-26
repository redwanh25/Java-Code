package practice;
import java.util.Scanner;
public class Hlw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("Hello world!");
		scan.close();
	}
}
