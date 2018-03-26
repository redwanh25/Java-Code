package priorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import java.util.PriorityQueue;


class PaiR implements Comparable <PaiR> {
							// b1.compareTo(o.a1); ai line er jonno
	private Integer a1;		// reference type hote hobe. primitive type hole hobe na.
	private Integer b1;		// mane Integer er jaygay int lekhle hobe na.
	
	public PaiR(int a1, int b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	public Integer getA1() {
		return a1;
	}
	public Integer getB1() {
		return b1;
	}
	
	@Override
	public int compareTo(PaiR o) {		
		return a1.compareTo(o.a1);
	}
	
//	@Override
//	public int compareTo(PaiR o) {		
//		return b1.compareTo(o.b1);
//	}

}

public class PairDemo_Comparable {

	public static void main(String[] args) {
//		PriorityQueue <PaiR> q = new PriorityQueue<>();		// min heap
		PriorityQueue <PaiR> q = new PriorityQueue<>(Collections.reverseOrder());	// max heap
		q.add(new PaiR(7, 23));
		q.add(new PaiR(2, 32));
		q.add(new PaiR(5, 25));
		q.add(new PaiR(1, 30));
		
		while (!q.isEmpty()) {
		    PaiR i = q.poll();
		    System.out.println(i.getA1() + " " + i.getB1());
		}
	}
}
