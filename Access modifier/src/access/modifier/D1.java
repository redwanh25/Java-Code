package access.modifier;

public class D1 {

	public int a;
	protected int b;
	int c;
	private int d;
	
	public static void main(String[] args) {
		int sum = 20;
		D1 temp = new D1();
		temp.d = 400;
		System.out.println(sum + temp.d);	// output : 420	(four twenty)
	}
}

/*
 * 
 * Access Modifiers			Same Class      Same Package       Subclass   	  Other packages
 * public              			Y                Y                Y                Y
 * protected          			Y                Y                Y                N
 * no access modifier 			Y                Y                N                N
 * private              		Y                N                N                N
 * 
 * 
 */



/*

public class D1 {

	static int a;	// static na dile object toiri kore kaj korte hobe. noile kaj kora jabe na.
					// like uporer moto.
	public static void main(String[] args) {
		int sum = 0;
		Scanner cin = new Scanner(System.in);
		a = cin.nextInt();
		System.out.println((sum + a));
		cin.close();
	}
}

*/
