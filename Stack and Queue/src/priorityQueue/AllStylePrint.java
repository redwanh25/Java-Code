package priorityQueue;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AllStylePrint {

	public static void main(String[] args) {
		PriorityQueue <Integer> q = new PriorityQueue<>();								// min heap
//		PriorityQueue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());	// max heap
		q.add(6);  
		q.add(9);
		q.add(5);
		q.add(64);
		q.add(6);
		System.out.println(q + "\n");
		for(Integer i : q) {
			int s = i;
			System.out.println(s);
		}
		System.out.println();
		
		Enumeration<Integer> e = Collections.enumeration(q);
		while(e.hasMoreElements()) {
			int s = e.nextElement();
			System.out.println(s);
		}
		System.out.println();
		
		Iterator <Integer> it = q.iterator();
		while(it.hasNext()) {
			int s = it.next();
			System.out.println(s);
		}
		System.out.println();
		
		AllStylePrint s = new AllStylePrint();
		s.print(q);
		System.out.println();
		s.print1(q);
		System.out.println();
		s.print2(q);
		System.out.println();
		
		// sorted
		while (!q.isEmpty()) {
		    Integer i = q.poll();
		    System.out.println(i);
		}
	}
	
	public void print1(PriorityQueue <Integer> t){
		for(Integer i : t) {
			int s = i;
			System.out.println(s);
		}
	}
	public <T extends Integer> void print(PriorityQueue <T> t){
		for(Integer i : t) {
			int s = i;
			System.out.println(s);
		}
	}
	public void print2(PriorityQueue <?> t){
		for(Object i : t) {
			int s = (int) i;
			System.out.println(s);
		}
	}
}






