import java.util.Scanner;

public class TheatreSquare {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double a = cin.nextDouble();
		double b = cin.nextDouble();
		double c = cin.nextDouble();
		System.out.printf("%.0f", (Math.ceil(a/c) * Math.ceil(b/c)));
	}

}
