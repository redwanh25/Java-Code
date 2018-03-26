package priorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

// wrong code...

import java.util.PriorityQueue;


class Pair1{
							// b1.compareTo(o.a1); ai line er jonno
	private Integer a1;		// reference type hote hobe. primitive type hole hobe na.
	private Integer b1;		// mane Integer er jaygay int lekhle hobe na.
	
	public Pair1(int a1, int b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	public Integer getA1() {
		return a1;
	}
	public Integer getB1() {
		return b1;
	}
}

class MinHeap implements Comparator<Pair1>{

	@Override
	public int compare(Pair1 o1, Pair1 o2) {
		return o1.getB1().compareTo(o2.getB1());
	}
	
}

public class PairDemo_Comparator {

	public static void main(String[] args) {
		
//		PriorityQueue <Pair1> q = new PriorityQueue<>(new Comparator<Pair1>() {
//			@Override
//			public int compare(Pair1 o1, Pair1 o2) {
//				return o1.getA1().compareTo(o2.getA1());
//			}
//		});		// min heap
		
		PriorityQueue <Pair1> q = new PriorityQueue<>(new MinHeap());

//		PriorityQueue <Pair1> q = new PriorityQueue<>(Collections.reverseOrder(), new MinHeap());		
//		aita kaj kortese na.. but, keno sheta bujhtesina.
		
		q.add(new Pair1(7, 23));
		q.add(new Pair1(2, 32));
		q.add(new Pair1(5, 25));
		q.add(new Pair1(1, 30));
		
		while (!q.isEmpty()) {
		    Pair1 i = q.poll();
		    System.out.println(i.getA1() + " " + i.getB1());
		}
	}
}
