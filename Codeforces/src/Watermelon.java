
import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Redwan r = new Redwan();
		int a = r.ami();
		r.wat(a);
	}
}

class Red {
	public void wat(int a) {
		System.out.println( a % 2 == 0 && a >= 4 ? "YES" : "NO");
	}
}

class Redwan extends Red{
	public int ami() {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		cin.close();
		return a;
	}
}
