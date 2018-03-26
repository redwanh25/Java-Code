package biginteger;

import java.util.*;
import java.math.*;

public class Divide {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double x = scan.nextDouble();
		BigDecimal d = BigDecimal.valueOf(x);
		double y = scan.nextDouble();
		BigDecimal d1 = BigDecimal.valueOf(y);
		d = d.divide(d1);		// 6 3 = 2	 // 3 6 = 0.5
		System.out.print(d);
		scan.close();
	}
}
