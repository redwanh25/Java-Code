package problem_solving;

import java.util.Scanner;

public class Modular_Fibonacci {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			long n = cin.nextInt();
			long m = cin.nextInt();
			long a = 0, b = 1, c = 1;
			if(n == 1) {
				System.out.println(a);
			}
			else if(n == 2) {
				System.out.println(b);
			}
			else {
				for(long i = 3; i <= n; i++) {
					a = b;
					b = c;
					c = a + b;
				}
				System.out.printf("%.0f\n",((c % Math.pow(2, m)) + Math.pow(2, m)) % Math.pow(2, m) );
			}
		}
	}
}
