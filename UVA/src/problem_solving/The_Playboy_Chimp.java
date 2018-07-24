package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class The_Playboy_Chimp {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Integer[] arr_asc = new Integer[n];
		Integer[] arr_des = new Integer[n];
		for(int i = 0; i < arr_asc.length; i++) {
			arr_asc[i] = cin.nextInt();
			arr_des[i] = arr_asc[i];
		}
		Arrays.sort(arr_des, Collections.reverseOrder());
		int m = cin.nextInt();
		for(int i = 0; i < m; i++) {
			int data = cin.nextInt();
			int j = 0;
			while(j < n && arr_asc[j] < data) {
				j++;
			}
			System.out.print(j == 0 ? "X" : arr_asc[j-1]);
			System.out.print(" ");
			j = 0;
			while(j < n && arr_des[j] > data) {
				j++;
			}
			System.out.println(j == 0 ? "X" : arr_des[j-1]);
		}
	}
}


