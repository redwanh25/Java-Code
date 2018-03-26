package besic;

import java.util.Arrays;
import java.util.Comparator;

class Person2{
	public String name;
	public Person2(String name) {
		this.name = name;
	}
}

public class ArraySort {

	public static void main(String[] args) {
		Person2[] list = new Person2[] {
			new Person2("Redwan"),
			new Person2("edwan"),
			new Person2("dwan"),
			new Person2("wan"),
		};
		
		Arrays.sort(list, new Comparator<Person2>() {		// Comparator hosse akta interface so, aitar lambda expression use kora jabe.
			@Override
			public int compare(Person2 o1, Person2 o2) {
				return o2.name.compareTo(o1.name);
			}
		});
		
		Arrays.sort(list, (Person2 o1, Person2 o2) -> {
			return o2.name.compareTo(o1.name);
		});
		Arrays.sort(list, (o1, o2) -> {
			return o2.name.compareTo(o1.name);
		});
		Arrays.sort(list, (o1, o2) -> o2.name.compareTo(o1.name));
		
		for(Person2 i : list) {
			System.out.println(i.name);
		}
	}
}

