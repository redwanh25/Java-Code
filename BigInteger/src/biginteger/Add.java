package biginteger;

import java.util.Scanner;
import java.math.BigInteger;

public class Add {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			add(scan.nextBigInteger(), scan.nextBigInteger());
		}
		scan.close();
	}
	public static void add(BigInteger a, BigInteger b) {
		BigInteger x = BigInteger.ZERO;
		x = a.add(b);
		System.out.println(a + " + " + b + " = " + x);
	}
}
