package abstract_interface;

public class Abstract1 {

	public static void main(String[] args) {
	//	A obj = new A();	// we can't create a object for abstract class
	// 	B obj = new B();	// we can't create a object for abstract class
	//--------------------
		C obj = new C() {		// aita k anonymous class bole. jar class er nam nai.
			@Override
			public void swim() {
				System.out.println("obj");
			}
		};
		obj.swim();
		
		D obj1 = new D();
		obj1.swim();
		obj1.ride();
		
		C obj2 = new D(); 	 // we can create a object for subclass with abstract superclass type.
		obj2.swim();		 
	//  C obj2 = new C();    // but we can not create a object for abstract superclass.
		
		C obj3 = new D();
	//	obj3.ride();		// we can not write this line. because obj3 reference er type hosse C and
							// amra jei method k call koresi shei method ta superclass er kono method
	// k override kore ni. jodi override na kore taile amader downcasting kore call korte hobe. override 
	// na korle downcasting sara amra shudu superclass er method ke call korte parbo na. r override korle
	// amra je subclass er object toiri korbo tar method k call kora jabe.
		
		obj3.red();
		( (D) obj3).ride();
		
	//------------------------
		
	//	F obj6 = new F();
		E obj7 = new F();
		
		
	}
}

// part 1...

abstract class A {			// class a at least akta method jodi abstract thake taile e
	public void swim() {	// amder class er age abstract likhte hobe.
		
	}
	public abstract void run();
}

abstract class B {			// class a jodi akta method o abstract na thake taile o abstract likha jabe.
	public B() {
		// abstract class a constructor toiri kora jay
	}
	public void swim() {
		
	}
	public int run(int a) {
		int b = a;
		return b;
	}
}
//----------------------------------------

// part 2...

abstract class C {
	
	public abstract void swim();
	public void red() {
		System.out.println("obj3");
	}
}

class D extends C {
	
	@Override
	public void swim() {
		System.out.println("obj1 + obj2");
	}
	public void ride() {
		System.out.println("obj3 downcast");
	}
}
//-----------------------------------------

class E {
	public E() {
		System.out.println("obj6 + obj7");
	}
	public E(int x) {
		System.out.println("***");
	}
}

class F extends E {
	public F() {
	//	super();	// default vabe likha thake. na likhleo problem nai.	page: 169
	//	super(1);	// aita default vabe likha thake na. argument shoho nije call korte hoy.
	//  akshathe duita super keyword use kora jay na.
		System.out.println("obj6 + obj7 : R");
	}
}







