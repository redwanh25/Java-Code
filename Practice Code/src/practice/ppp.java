package practice;
import java.util.Scanner;
import java.math.BigInteger;

public class ppp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger a = scan.nextBigInteger();
			int b = scan.nextInt();
			BigInteger big1 = a.pow(b);
			BigInteger c = scan.nextBigInteger();
			int d = scan.nextInt();
			BigInteger big2 = c.pow(d);
			int res = big1.compareTo(big2);
			if(res == 0) {
				// big1 soto hole -1
				// big1 and big2 same hole 0
				// big1 boro hole 1
				System.out.println(res);
			}
			else{
				System.out.println(res);
			}
		}
		scan.close();
	}
}
