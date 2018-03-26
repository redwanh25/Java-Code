package practice;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		char[][] s = { {'a', 'b'}, {'c', 'd'} };
		for(char[] i : s) {
			for(char j : i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}