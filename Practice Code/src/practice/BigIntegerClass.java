package practice;

import java.util.Scanner;

public class BigIntegerClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		Fact f = new Fact();
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			f.calculate(x);
			f.print();
		}
		scan.close();
	}
}
