package ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1{
	private String firstName;
	private String lastName;
	public Person1(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}

public class ComparatoR {

	public static void main(String[] args) {
		List <Person1> list = new ArrayList<>();
		list.add(new Person1("Redwan", "Ramij"));
		list.add(new Person1("edwan", "Ramij"));
		list.add(new Person1("dwan", "Ramij"));
		list.add(new Person1("wan", "Ramij"));
		
		Collections.sort(list, new Comparator<Person1>(){
			@Override
			public int compare(Person1 o1, Person1 o2) {		// anonymous class		page: 344. onno vabe o kora jay
				return o1.getLastName().compareTo(o2.getFirstName());	// jeita sort korte chai sheta vitore thakbe..
			}
		});
		
		for(Person1 p : list) {
			
			System.out.println(p.getFirstName() + " " + p.getLastName());
			System.out.println(list.indexOf(p));
			
		}
		int position = -1;
		for(Person1 p : list) {
            if(p.getFirstName().equals("Redwan")) {
                position = list.indexOf(p);
                break;
            }
        }
		System.out.println(position);
	}
}
/*
 * reference type or object array sort korte hole obosshoi object k "Comparable" interface ke implement
 * or sort method a akta "comparator" pass korte hobe.. 
 * 
 * 
 */
