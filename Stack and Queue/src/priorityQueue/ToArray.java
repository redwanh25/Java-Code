package priorityQueue;

import java.util.PriorityQueue;
public class ToArray {

	public static void main(String[] args) {
		PriorityQueue <Integer> q = new PriorityQueue<Integer>();
		q.add(7);  
		q.add(9);
		q.add(5);
		q.add(6);
		q.add(6);
		System.out.println(q + "\n");
		for(Integer i : q) {
			int s = i;
			System.out.println(s);
		}
		System.out.println();
		
		Integer[] a = new Integer[q.size()];	// int dile hobe na.
		q.toArray(a);
		while (!q.isEmpty()) {
		    Integer i = q.poll();
		    System.out.println(i);
		}
		System.out.println();
		for(int i : a) {
			System.out.println(i);
		}
	}
}

