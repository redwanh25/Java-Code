package graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Scanner;

class Pair4 {
	private int wt, u, v;
	public Pair4(int wt, int u, int v) {
		this.wt = wt;
		this.u = u;
		this.v = v;
	}
	public int getWt() {
		return wt;
	}
	public int getU() {
		return u;
	}
	public int getV() {
		return v;
	}
}

public class ShortestPath_BellmanFord {
	
	private int vertex, edge;
	private ArrayList <Pair4> adj;
	private int[] cnt, parent;
	private LinkedHashSet <Integer> set;
	
	public ShortestPath_BellmanFord(int vertex, int edge, int size) {
		this.vertex = vertex;
		this.edge = edge;
		adj = new ArrayList<>();
		cnt = new int[size];
		parent = new int [size];
		Arrays.fill(cnt, Integer.MAX_VALUE);
		set = new LinkedHashSet<>();
	}
	public void bellmanFord(int src, int d) {
		cnt[src] = 0;
		for(int i = 0; i < vertex-1; i++) {
			for(int j = 0; j < edge; j++) {
				int u = adj.get(j).getU();
				int v = adj.get(j).getV();
				int wt = adj.get(j).getWt();
				if(cnt[u] != Integer.MAX_VALUE && (cnt[v] > cnt[u] + wt)) {
					cnt[v] = cnt[u] + wt;
					parent[v] = u;
					
				}
			}
		}
		for(int j = 0; j < edge; j++) {
			int u = adj.get(j).getU();
			int v = adj.get(j).getV();
			int wt = adj.get(j).getWt();
			if(cnt[u] != Integer.MAX_VALUE && (cnt[v] > cnt[u] + wt)) {
				System.out.println("Graph contains negative weight cycle");
				return;
			}
		}
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			int i = it.next();
			System.out.println(src + " --> " + i + " = " + cnt[i]);
		}
		ArrayList <Integer> list = new ArrayList<>();
		list.add(d);
		for(int v = d; v != src; v = parent[v]) {
			int u = parent[v];
			list.add(u);
		}
		Collections.reverse(list);
		System.out.println("Path : " + list);
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		ShortestPath_BellmanFord g = new ShortestPath_BellmanFord(v, eg, size);
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			g.adj.add(new Pair4(cin.nextInt(), a, b));
			
			// for printing
			g.set.add(a);
			g.set.add(b);
		}
		int source = cin.nextInt();
		int destination = cin.nextInt();
		g.bellmanFord(source, destination);
		cin.close();
	}
}

/*

5 7
1 2 10
1 3 20
2 4 5
2 3 30
4 3 15
4 5 8
3 5 6
1 5

Geeks for Geeks (bellman ford)
5 8
0 1 -1
0 2 4
1 2 3
1 3 2
1 4 2
3 2 5
3 1 1
4 3 -3
0 4

negative wighted circle
4 4
1 2 1
2 3 -5
3 4 2
4 2 2
1 4

*/

