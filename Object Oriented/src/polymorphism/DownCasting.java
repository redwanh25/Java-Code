package polymorphism;

class Dog {
	public void swirl() {
		System.out.println("Dog");
	}
}

class DeshiDog extends Dog {
	public void swirl_1() {
		System.out.println("DeshiDog");
	}
}

class BideshiDog extends Dog {
	public void swirl_2() {
		System.out.println("BideshiDog");
	}
}

public class DownCasting {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog deshiDog = new DeshiDog();
		Dog bideshiDog = new BideshiDog();
		
		dog.swirl();
		
		DeshiDog redwan = (DeshiDog) deshiDog;		// Downcasting
		redwan.swirl_1();
		
		((BideshiDog) bideshiDog).swirl_2();		// Downcasting
		
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