package practice;

import java.util.Scanner;

public class NewLineInput {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		cin.nextLine();		// new line ta k ai khane input hishebe niye nibe..
		String s = cin.nextLine();
		String s1 = cin.nextLine();
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(s1);

	}
}
