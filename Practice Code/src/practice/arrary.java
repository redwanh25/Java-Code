package practice;

import java.util.Arrays;
import java.util.Scanner;
public class arrary {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[][] a = new int[2][3];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
