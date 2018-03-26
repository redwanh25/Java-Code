package practice;

import java.util.Scanner;

public class EOF {

	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		EOF ss = new EOF();
//		int a =ss.cin.nextInt();	// static na thakle
	//	while(cin.hasNext()) {		// this line works like while(scanf("%d", &a) != EOF)
// Extra er moddhe video ase dekho. cin.hasNextInt()
// ctrl + z dile terminate korbe
			System.out.println((cin.nextInt() & 1) == 0 ? "EVEN" : "ODD");
	//	}
	//	cin.close();
		ss.red();
	}
	public void red() {
		int a = cin.nextInt();
		System.out.println(a);
	}
}
