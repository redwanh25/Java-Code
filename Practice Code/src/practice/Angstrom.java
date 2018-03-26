package practice;

import java.util.Scanner;

public class Angstrom {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum = 0, a = cin.nextInt();
		final int sample = a;
		while(a != 0) {
			int z = a % 10;
			a /= 10;
			sum += Math.pow(z, 3);
		}
		System.out.println((sum == sample) ? "angstrom" : "not angstrom");
		cin.close();
	}
}
