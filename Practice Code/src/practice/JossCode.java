package practice;

import java.util.Scanner;

public class JossCode {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] a = new int[5];
		a[cin.nextInt()] = cin.nextInt();
		for(int i : a) {
			System.out.println(i);
		}
	}

}
