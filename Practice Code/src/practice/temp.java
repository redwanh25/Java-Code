package practice;

import java.util.Scanner;
import java.math.BigInteger;

public class temp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double y = scan.nextDouble();
		int z;
		z = (int)y + x;
		System.out.println(x + " + " + y + " = " + z);
		scan.close();
	}

}
