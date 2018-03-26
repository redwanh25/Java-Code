package ListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {		// ai method ta Override korte hobe jodi ami output dekhte chai.
		return (firstName + " " + lastName);	// karon ("Redwan", "Ramij") dui ta parameter ase.
	}
/*
 * 	r Override na korle main method er vitore ai loop ta chalaite hobe.
 * 
 * 	for(Person p : list) {
 *		System.out.println(p.getFirstName() + " " + p.getLastName());
 *	}
 */	
	@Override
	public int compareTo(Person o) {
		return lastName.compareTo(o.firstName);		// jeita sort korte chai sheta vitore thakbe..
//		return getLastName().compareTo(o.getFirstName());		// same
	}
}

public class ComparablE {

	public static void main(String[] args) {
		List <Person> list = new ArrayList<>();
		list.add(new Person("Redwan", "Ramij"));
		list.add(new Person("edwan", "Ramij"));
		list.add(new Person("dwan", "Ramij"));
		list.add(new Person("wan", "Ramij"));
		
		Collections.sort(list);
		
		
		for(Person p : list) {
			System.out.println(p);
		}
		

	}

}
