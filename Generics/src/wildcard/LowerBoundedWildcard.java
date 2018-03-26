package wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {

	public static void print(List <? super Integer> list) {		// Integer, Number, and Object class process korbe.
		for(Object i : list) {									// mane "Integer" class er superclass gulo niye kaj korbe
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		List <Integer> my = new ArrayList <>();
		my.add(1);
		my.add(2);
		
		print(my);
		
		List <Number> my1 = new ArrayList <>();
		my1.add(1.1f);
		my1.add(2.5f);
		
		print(my1);
		
		List <Object> my2 = new ArrayList <>();
		my2.add("Redwan");
		my2.add("Ramij");
		my2.add(3.1f);
		my2.add(4.5f);
		
		print(my2);
		
//		List <String> my3 = new ArrayList <>();
//		my3.add("Redwan");
//		my3.add("Ramij");
//		my3.add("Sharar");
//		
//		print(my3);			// not possible
	}

}
