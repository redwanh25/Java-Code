package abstract_interface;

// interface er kono object toiri kora jay na but Type hishe use kora jay.
// abstract class er kono object koiri kora jay na but Type hishebe use kora jay.
// akta class er object toiri kora jay and Type hishebe o use kora jay.

public class Interface {
	public static void main(String[] args) {
		G obj1 = new H();
		obj1.boy();
		obj1.girl();
		
		System.out.println(H.a);
		System.out.println(G.b);
		
		J obj2 = new J();
		obj2.boy();
		obj2.girl();
		
	//	L obj3 = new N();
	//	N obj3 = new N();
	//	K obj3 = new N();
		G obj3 = new N();
	//	M obj3 = new N();
	//	obj3.red();
		
		obj3.boy();
		obj3.girl();
	}
}

// interface a shob method e abstract hoy. constructor akta method er moto. but constructor er age
// abstract likha jay na. ai jonno interface a kono constructor toiri kora jay na.

interface G {
	int a = 10;		// ai khane int er age by default "public static final" likha ase;
	public static final int b = 20;
	void boy();		// ai khane void boy() er age by default "public abstract" likha ase.
	public abstract void girl();
}

interface I {
	public abstract void boy();
}

interface K {
	public abstract void girl();
}

// interface G te void boy() method a void boy() er age by default "public abstract" likha ase.
// so, amra jokhon override korbo tokhon amader "public" ta must likhte hobe,

class H implements G {
	@Override
	public void boy() {		// aikhane "public" na dile error hobe. 
		System.out.println("obj1 \"H\" boy   " + a);
	}
	@Override
	public void girl() {
		System.out.println("obj1 \"H\" girl");
	}
}

class O extends H {
	
}

class J implements G, I {	// akta class onek gulu interface ke inherit korte pare.
	@Override
	public void boy() {
		System.out.println("obj1 \"J\" boy");
	}
	@Override
	public void girl() {
		System.out.println("obj1 \"J\" girl");
	}
}

interface L extends K, I {
	// something
}

abstract class M {	
	public void red() {
		System.out.println("redwan");
	}
}

class N extends M implements L, K, I, G {	// class N extends M implements L, K, I, G
	@Override								// ai line er mane N class , "M" ke inherit kore.
	public void boy() {						// N class L K I G ke implements (inherit) kore.
		System.out.println("obj3 \"N\" boy");
	}
	@Override
	public void girl() {
		System.out.println("obj3 \"N\" girl");
	}
}

// akta class just akta class ke ei inherit korte pare.	(use "extends")
// akta class just akta abstract class ke ei inherit korte pare.	(use "extends")
// akta class onek gulu interface k inherit korte pare. (use "implements")
// akta interface onek gulu interface k inherit korte pare. (use "extends")
