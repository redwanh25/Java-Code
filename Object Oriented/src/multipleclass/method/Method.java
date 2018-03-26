package multipleclass.method;

import java.util.Scanner;

public class Method {

	static int add(int a, int b) {		// "static" thakle just
		return a+b;				// add(a, b) or Method.add(a, b) likhle e hobe
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("X = " + Method.add(a, b));
//		System.out.println("X = " + add(a, b));
		Method x = new Method();
		x.red1();
		scan.close();
	}
	public void red() {
		System.out.println("redwan");
	}
	public void red1() {
		//Method m = new Method();
		//m.red();
		red();		// main method er baire onno kono method theke onno kono method k call korte kono object create kora lajbe na.
					// jodi static na thake.
		System.out.println(add(2, 3));
	}
}

/*
package hello;

import java.util.Scanner;

public class Method {

	int add(int a, int b) {		// static na thakle object toiri kore kaj korte hobe
		return a+b;				// r.add(a, b)
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		method r = new Method();
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("X = " + r.add(a, b));
		scan.close();
	}
}
*/
