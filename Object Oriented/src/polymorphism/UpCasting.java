package polymorphism;

class Liquid {
	protected void swirl() {
		System.out.println("Liquid");
	}
}

class Coffee extends Liquid {
	@Override
	public void swirl() {		// look at this line. override korar shomoy shadharonoto modifier same
		// hoy. tobe superclass er method jodi protected hoy subclass a shetake public kora jay.
		// tobe er ulto ta shomvob na.
		System.out.println("Coffee");
	}
}

class Milk extends Liquid {
	@Override
	public void swirl() {
		System.out.println("Milk");
	}
}

class CoffeeCup {
	private Liquid innerLiquid;
	public void addLiquid(Liquid liq) {
		innerLiquid = liq;
		innerLiquid.swirl();
	//	liq.swirl();
	}
}

public class UpCasting {

	public static void main(String[] args) {
		Liquid liquid = new Liquid();
		Coffee coffee = new Coffee();
		Milk milk = new Milk();
		
		CoffeeCup cup = new CoffeeCup();
		
		cup.addLiquid(liquid);
		cup.addLiquid(coffee);
		cup.addLiquid(milk);
		
	}
}

/* 1. subclass jodi superclass er method k Override na kore taile method call korar shomoy
 * 	  shudhu matro superclass er method ke e call kora jay. tobe "Downcasting" kore ai problem
 * 	  er solution kora jay.
 * 
 * 2. subclass jodi superclass er method Override kore taile run time a subclass er method
 *    tai call hobe.
 * 
 */

