
//import java.util.Scanner;

public class SummerCamp {

	public static void main(String[] args) {
	//	Scanner cin = new Scanner(System.in);
		String s = "";
		for(int i = 1; i < 1000; i++) {
			s += i;
		}
	// 	System.out.println(s);
	//	while(cin.hasNextInt()) {
		//	int a = cin.nextInt();
			int a = new java.util.Scanner(System.in).nextInt();
			System.out.println(s.charAt(a-1));
	//	}
	}
}
