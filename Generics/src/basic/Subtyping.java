package basic;

class Container <T> {
	private T[] obj;
	private static final int max = 10;
	private int cnt;
	
	@SuppressWarnings("unchecked")		// ai annotation na dile o hobe.
	public Container() {
//		obj = new T[max];   			// ai ta kora jabe na. ai jonno nicher ai way. but, warning dibe.
		obj = (T[]) new Object[max];
	}
	public Container(int a) {
//		obj = new T[a];   				// ai ta kora jabe na. ai jonno nicher ai way. but, warning dibe.
		obj = (T[]) new Object[a];
	}
	
	public void addValue(T type) {
		if(cnt < max) {
			obj[cnt++] = type;
		}
		else System.out.println("Full");
	}
	
	public T getValue(int x) {
		if(x >= max) {
			throw new IllegalArgumentException("index is full");	// aita runtimeException (Unchecked Exception)...
		}
		return obj[x];
	}
	public void print() {
		for(int i = 0; i < cnt; i++) {
			System.out.print(obj[i] + " ");
		}
		
		System.out.println();
		
		for(Object i : obj) {	// amra jani j shob class er super class "Object"
			System.out.print(i + " ");
		}
	}
}

public class Subtyping {
	public static void main(String[] args) {
		Container <Integer> con = new Container<>(5);
		con.addValue(34);
		con.addValue(4);
		con.addValue(43);
		System.out.println(con.getValue(1));
		con.print();
	}
}

// jodi akta class "Foo" onno akta class "Bar" er subclass hoy, taile "Foo" er generic class kono vabe e "Bar" er
// Generic class er subclass noy.
/*
 * Bar b = new Foo(); 								// aita possible
 * Object o = new String();							// aita possible
 * Container <Bar> b = new Container<Foo>(); 		// but, aita possible na
 * Container <Object> b = new Container<String>(); 	// but, aita possible na
 * 
 */
