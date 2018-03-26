package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

	public static void print(List <?> list) {		// Wildcard
		for(Object i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		List <Integer> my = new ArrayList <>();
		my.add(1);
		my.add(2);
		
		print(my);
		
		List <String> my1 = new ArrayList <>();
		my1.add("Redwan");
		my1.add("Nazia");
		
		print(my1);
	}
}

