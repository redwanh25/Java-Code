package graph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
	private Integer wt, v;
	public Pair(int wt, int v) {
		this.wt = wt;
		this.v = v;
	}
	public int getWt() {
		return wt;
	}
	public int getV() {
		return v;
	}
	@Override
	public int compareTo(Pair o) {
		return wt.compareTo(o.wt);
	}
}

public class MST_Prims {
	
	private int vertex, edge;
	private boolean[] vis;
	private PriorityQueue <Pair> q;
	private LinkedList <Pair> adj[];
	
	public MST_Prims(int v, int eg, int size) {
		vertex = v;
		edge = eg;
		vis = new boolean[size];
		q = new PriorityQueue<>();
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b, int wt) {
		adj[a].add(new Pair(wt, b));
		adj[b].add(new Pair(wt, a));
	}
	
	public int prims(int s) {
		int n = 0, sum = 0;
		System.out.print(s);
		while(n < vertex-1) {
			vis[s] = true;
			n++;
			for(int i = 0; i < adj[s].size(); i++) {
				q.add(adj[s].get(i));
			}
			while(vis[q.peek().getV()] == true) {
				q.poll();
			}
			sum += q.peek().getWt();
			s = q.poll().getV();
			System.out.print(" --> " + s);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		MST_Prims g = new MST_Prims(v, eg, size);
		for(int i = 0; i < eg; i++) {
			g.addEdge(cin.nextInt(), cin.nextInt(), cin.nextInt());
		}
		System.out.println("\nTotal cost : " + g.prims(1));
		cin.close();
	}
}


/*

6 8
1 4 1
2 4 2
2 5 -2
2 6 4
3 5 3
3 6 1
4 5 3
5 6 5

5 7
1 2 10
1 3 20
2 4 5
2 3 30
4 3 15
4 5 8
3 5 6

3 3
1 2 5
2 3 5
1 3 9

*/