package problem_solving;

// wrong answer

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChildrensGame10905 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true) {
			int n = cin.nextInt();
			if(n == 0) {
				break;
			}
			String[] str = new String[n];
			for(int i = 0; i < n; i++) {
				str[i] = cin.next();
			}
			Arrays.sort(str, Collections.reverseOrder());
			
			String res1 = "";
			for(String s : str) {
				res1 += s;
			}
			System.out.println(res1);
			
			boolean ck = true;
			while(ck) {
				ck = false;
				for(int i = 1; i < n; i++) {
					if(str[i-1].length() != str[i].length()) {
						int x = str[i-1].length() - str[i].length();
						if(x > 0 &&  str[i-1].substring(0, x).equals(str[i])) {
							int bol = str[i-1].substring(x, str[i-1].length()).compareTo(str[i]);
							if(bol < 0) {
								String temp = str[i-1];
								str[i-1] = str[i];
								str[i] = temp;
								ck = true;
							}
						}
					}
				}
			}
			String res = "";
			for(String s : str) {
				res += s;
			}
			System.out.println(res);
		}
		cin.close();
	}
}
