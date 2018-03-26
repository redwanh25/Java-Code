package practice;
import java.util.*;
public class ListCollection {

	public static void main(String[] args) {
		   // create a LinkedList
		   LinkedList listCollection = new LinkedList();

		   // add some elements
		   listCollection.add("Hello");
		   listCollection.add(2);
		   listCollection.add("Chocolate");
		   listCollection.add("10");

		   // print the list
		   System.out.println("LinkedList: " + listCollection);

		   // add a new element at the end of the list
		   listCollection.add("Element");

		   // print the updated list
		   System.out.println("LinkedList: " + listCollection);
		   
	}

}
