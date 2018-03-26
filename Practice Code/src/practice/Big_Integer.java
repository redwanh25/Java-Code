package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			calculate(scan.nextInt());
		}
		scan.close();
	}
	public static void calculate(int x) {
		BigInteger res = BigInteger.ONE;
		for(int i = 2; i <= x; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		} 
		System.out.println(res);
	}
}
