package ListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person2{
	private String name;
	public Person2(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

public class ArraySort {

	public static void main(String[] args) {
		Person2[] list = new Person2[] {
			new Person2("Redwan"),
			new Person2("edwan"),
			new Person2("dwan"),
			new Person2("wan")
		};
		List <Person2> list1 = Arrays.asList(
			new Person2("Redwan"),
			new Person2("edwan"),
			new Person2("dwan"),
			new Person2("wan")
		);
		
		Arrays.sort(list, new Comparator<Person2>() {
			@Override
			public int compare(Person2 o1, Person2 o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		
//		for(int i = 0; i < 4; i++) {
//			System.out.println(list[i].getName());
//		}
		
		for(Person2 i : list) {
			System.out.println(i.getName());
		}
	}
}
