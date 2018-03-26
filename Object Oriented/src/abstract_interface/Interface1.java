package abstract_interface;

public class Interface1 {
	public static void main(String[] args) {
		S obj = new S();
		obj.print();

	}
}

// S -> R -> Q -> P

interface P {
	int a = 10;			// age 10 peye gese tai 30 print hoise
	void print1();		// ai khane "void" er age by default "public abstract" likha ase.
}

interface Q extends P {
	int a = 20;			// age 20 peye gese tai 30 print hoise
	void print2();		// ai khane "void" er age by default "public abstract" likha ase.
}

interface R extends Q {
//	int a = 30;			// age 30 peye gese tai 30 print hoise
	void print3();		// ai khane "void" er age by default "public abstract" likha ase. 
}

class S implements R {
	@Override
	public void print1() {		// jehetu override so public likhte hobe.
		
	}
	@Override
	public void print2() {
		
	}
	@Override
	public void print3() {
		
	}
	public void print() {
		System.out.println(a);
	}
}

