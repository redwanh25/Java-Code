package practice;

import java.math.BigInteger;

public class Fact{
	BigInteger a = BigInteger.ONE;
	public void calculate(int x) {
		for(int i = 1; i <= x; i++) {
			a = a.multiply(BigInteger.valueOf(i));
		}
	}
	public void print() {
		System.out.println(a);
		a = BigInteger.ONE;
	}
}
