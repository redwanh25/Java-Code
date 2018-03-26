package biginteger;

import java.util.Scanner;
import java.math.BigInteger;

public class Multiply {
	BigInteger x = BigInteger.valueOf(1);
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Multiply obj = new Multiply();
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			obj.multiply(BigInteger.valueOf(a[i]));
		}
		scan.close();
	}
	public void multiply(BigInteger n) {
	//	BigInteger x = BigInteger.valueOf(1);
		x = x.multiply(n);
		System.out.println(x);
	}
}
