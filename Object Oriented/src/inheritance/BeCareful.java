package inheritance;

class Liquid {
	public void swirl() {
		System.out.println("Liquid");
	}
}

class Coffee extends Liquid {
	public void swirl() {
		System.out.println("Coffee");
		super.swirl();		// subclass theke superclass er method k call korar jonno "super" keyword
							// use kora hoyese. onno kono method theke call korle hobe na.
	}
//	public void swirl_1() {
//		System.out.println("Coffee");
//	}
}

class Milk extends Coffee {
	public void swirl() {
		System.out.println("Milk");
		super.swirl();
	}
//	public void swirl_2() {
//		System.out.println("Coffee");
//	}
}

public class BeCareful {

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		Milk milk = new Milk();
		
		coffee.swirl();
		milk.swirl();
		
	}
}

// inheritance a amra jani j subclass a automatic superclass er shob property chole ashe (constructor sara).
// but, method overloading hole jei class er object toiri kore method k call
// kora hoy shei class er method e call hoy.



