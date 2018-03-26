package biginteger;

import java.util.*;
import java.math.*;

public class Subtract {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double x = scan.nextDouble();
		BigDecimal d = BigDecimal.valueOf(x);
		double y = scan.nextDouble();
		BigDecimal d1 = BigDecimal.valueOf(y);
		d = d.subtract(d1);		// 6 3 = 3	 // 3 6 = -3
		System.out.print(d);
		scan.close();
	}
}
