package ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("dwan");
		list.add("wan");
		list.add("redwan");
		list.add("edwan");
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {		// anonymous class		page: 344. onno vabe o kora jay
				return o2.compareTo(o1);		// jeita sort korte chai sheta vitore thakbe..
			}
		});
		
//		Comparator<String> c = Collections.reverseOrder();		
//		Collections.sort(list, c);		
		
//		Collections.sort(list);
		
		for(String i : list) {
			System.out.println(i);
		}

	}
}
