import java.util.ArrayList;
import java.util.Scanner;

public class Duff_and_Meat {

	private static int minValue = 500;
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int x, y, min;
		long res = 0L;
		for(int i = 0; i < a; i++) {
			x = cin.nextInt();
			y = cin.nextInt();
			minValue = Math.min(y, minValue);
			res += x * minValue;
		}
		System.out.println(res);
	}

}
