package biginteger;

import java.math.BigInteger;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		BigInteger[] arr = new BigInteger[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = BigInteger.valueOf(i);
		}
		System.out.println(Arrays.toString(arr));
	}
}
