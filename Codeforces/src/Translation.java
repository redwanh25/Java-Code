import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String t = cin.nextLine();
		String s = cin.nextLine();
		System.out.println(t.equals(new StringBuffer(s).reverse().toString()) ? "YES" : "NO" );
		cin.close();
	}

}
