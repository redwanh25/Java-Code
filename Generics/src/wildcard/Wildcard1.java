package wildcard;

class Demo <T> {
	public T[] type;
	int c;
	public Demo() {
		type = (T[]) new Object[3];
	}
	public void add(T type) {
		this.type[c++] = type;
	}
}

public class Wildcard1 {

	public static void print(Demo <?> d) {
		for(Object i : d.type) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Demo <String> d = new Demo<>();
		d.add("Redwan");
		d.add("Ramij");
		d.add("Sharar");
		for(Object i : d.type) {	// (Object i : d) likha jay na karon, Demo <String> d = new Demo<>(); ai line ta compile korar por
			System.out.println(i);	// "Demo d = new Demo();" hoye jay. so, "d.type" likhe amader "type" take call korte hobe.
		}
		System.out.println();
		print(d);
	}
}
