package wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {

	public static void print(List <? extends Number> list) {		// ata shudhu matro "Number" class er subclass k process korte parbe.
		
		double sum = 0.0;
		for(Object i : list) {
			sum += ((Number) i).doubleValue();
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		List <Integer> my = new ArrayList <>();
		my.add(1);
		my.add(2);
		
		print(my);
		
		List <Double> my1 = new ArrayList <>();
		my1.add(3.4d);
		my1.add(6.8d);
		
		print(my1);
		print(Arrays.asList(55, 56, 67));
		
//		List <Object> my2 = new ArrayList <>();
//		my2.add(3.1f);
//		my2.add(4.5f);
//		
//		print(my2);										// not possible
		
//		List <String> my3 = new ArrayList <>();
//		my3.add("Redwan");
//		my3.add("Ramij");
//		my3.add("Sharar");
//		
//		print(my3);										// not possible
	}

}
