package access.modifier;

public class D2 {

	public static void main(String[] args) {
		D1 temp = new D1();
	//	temp.a = 3;		// possible (public)
		temp.b = 3;		// possible (protected)
	//	temp.c = 3;	 	// possible	(default)
	//  temp.d = 3;		// not possible (private)
		System.out.println(temp.b);
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






