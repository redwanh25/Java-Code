package access.modifier1;

import access.modifier.D1;

/*
 *	public class P1{
 *		public static void main(String[] args) {
 *			D1 temp = new D1();
 *		//	temp.a = 3;		// possible (public)
 *		//  temp.b = 3;		// not possible (protected)
 *		//	temp.c = 3;	 	// not possible	(default)
 *		//  temp.d = 3;		// not possible (private)
 *			System.out.println(temp.a);
 *		}
 *	}
 *
 */

public class P1 extends D1{
	
	public static void main(String[] args) {
//		D1 temp = new D1();
//		temp.b = 3;			// not possible (protected)
		
// 		jodi amra nijer package er baire onno package a "b" veriable k use korte chai
// 		taile just subclass a use kora jabe...
		
		P1 kalla = new P1();
		kalla.a = 10;
		kalla.b = 5;
		System.out.println(kalla.b);
	}
}


