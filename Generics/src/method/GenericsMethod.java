package method;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethod {
	
	public static <T> void print(T[] list) {
		for(T i : list) {
			System.out.println(i);
		}
	}	
	public static <T> int print1(T[] list) {
		for(T i : list) {
			System.out.println(i);
		}
		return 45;
	}	
	public static <T> void print2(List <T> list) {
		for(T i : list) {
			System.out.println(i);
		}
		for(Object i : list) {
			System.out.println(i);
		}
	}
	public static <T extends Number> void print3(T[] list) {
		for(T i : list) {
			System.out.println(i);
		}
	}
	public static <T extends Number> void print4(List <T> list) {
		for(T i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,2};		
		print(a);
		print3(a);
	//	System.out.println(print1(a));
		
		String[] b = {"Redwan","Nazia"};
		print(b);
//		print3(b);		// not possible. because <T extends Number>
	//	System.out.println(print1(b));
		
		List <Integer> my = new ArrayList <>();
		my.add(1);
		my.add(2);
		print2(my);
		print4(my);
		
		List <String> my1 = new ArrayList <>();
		my1.add("Redwan");
		my1.add("Nazia");
//		print4(my1);			// not possible. because, <T extends Number>
								// <T extends Object> aita hoile hoito.
	}
}
