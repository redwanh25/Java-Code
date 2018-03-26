package cse;

import java.util.Scanner;

public class Assignment2 {

	public static int findMinimum(int[] arr) {
		int minValue = arr[0];
		for(int i : arr) {
			minValue = Math.min(minValue, i);
		}
		return minValue;
	}
	
	public static int findMaximum(int[] arr) {
		int maxValue = arr[0];
		for(int i : arr) {
			maxValue = Math.max(maxValue, i);
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int i = 0, n = cin.nextInt();
		int[] arr = new int[n];
		while(i != n) {
			arr[i++] = cin.nextInt();
		}
		System.out.println(findMinimum(arr));
		System.out.println(findMaximum(arr));
		cin.close();
	}
}
