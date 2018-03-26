/*

package problem_solving;

import java.util.Scanner;
import java.math.BigInteger;

public class UVA_11879 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n, n1, n2;
		while(true) {
			n = scan.nextBigInteger();
			int ck = n.compareTo(BigInteger.ZERO);
			if(ck == 0)
				break;
			n1 = n.divide(BigInteger.TEN);
			n2 = n.mod(BigInteger.TEN);
			n2 = n2.multiply(BigInteger.valueOf(5));
			n = n1.subtract(n2);		
			BigInteger res = n.mod(BigInteger.valueOf(17));
			int r = res.compareTo(BigInteger.ZERO);
			if(r == 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}

*/

package problem_solving;

import java.math.BigInteger;
import java.util.Scanner;
import static java.math.BigInteger.*;

public class UVA_11879 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n , d17;
		d17 = TEN.add(valueOf(7));
		while(true){
			n = sc.nextBigInteger();
			if(n.equals(ZERO))break;
			if(n.mod(d17)==ZERO)System.out.println(1);
			else System.out.println(0);
		}
		sc.close();
	}
}

