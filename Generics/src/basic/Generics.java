package basic;

import java.util.ArrayList;
import java.util.List;

/*
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 * 
 * ami "T, E, V etc" er shob shortcut er bodole je nam dibo shetai hobe.
 * ai gulo nam just variable name er moto. ja dibo tai hobe. 2be ai shob shotcut
 * use kora valo. cs, shobai kore...
 */

class Temp <T> {		// T = Integer hoye gese.
	private T obj;		// private Integer obj;	hoye gese.
	
	public Temp(T obj) {	// Integer obj
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	public void showType() {
		System.out.println(obj.getClass().getName());			// java.lang.Integer
//		System.out.println(obj.getClass().getSimpleName());		// Integer
//		System.out.println(obj.getClass().getTypeName());		// java.lang.Integer
	}
}

public class Generics {
	public static void main(String[] args) {
		Temp <Integer> obj1 = new Temp<>(45);	// aikhane "int" mane "primitive" type use kora jabe na. refarence type use korte hobe. 
		obj1.showType();
		System.out.println(obj1.getObj());
		
		Temp <Integer> obj2 = new Temp<>(new Integer(65));
		obj2.showType();
		System.out.println(obj2.getObj());
		
		Temp <String> obj3 = new Temp<>("Redwan");
		obj3.showType();
		System.out.println(obj3.getObj());
		
		List <Temp<Integer>> list = new ArrayList<>();
		list.add(obj1);
		list.add(new Temp<>(2));
		System.out.println(list.get(1).getObj());
	}
}