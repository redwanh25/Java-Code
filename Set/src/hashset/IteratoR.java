package hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IteratoR {

	public static void main(String[] args) {
		List <String> s = new LinkedList<>();
		s.add("bedwan");
		s.add("aedwan");
		s.add("zRedwan");
		s.add("wedwan");
		Collections.sort(s);
		for(String i : s) {
			System.out.println(i);
		}

	}

}
