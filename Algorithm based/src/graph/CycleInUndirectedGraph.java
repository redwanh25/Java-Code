package graph;

import java.util.Scanner;

public class CycleInUndirectedGraph {
	
	class Pair {
		int u, v;
//		Pair(){
//			u = v = 0;
//		}
	}
	
	private int vertex, edge;
	private int node[];
	private Pair pair[];
	
	public CycleInUndirectedGraph(int vertex, int edge, int size) {
		this.vertex = vertex;
		this.edge = edge;
		node = new int[size];
		pair = new Pair[edge];
		for(int i = 0; i < edge; i++) {
			pair[i] = new Pair();
		}
	}
	
	public int find(int z) {
		if(node[z] == 0) {
			return z;
		}
		return find(node[z]);
	}
	
	public void union(int a, int b) {
		int x = find(a);
		int y = find(b);
		node[x] = y;
	}
	
	public boolean isCycle(CycleInUndirectedGraph g) {
		for(int i = 0; i < edge; i++) {
			int a = pair[i].u;		// int a = g.pair[i].u;
			int b = pair[i].v;		// int b = g.pair[i].v;
			if(find(a) == find(b)) {
				return true;
			}
			else {
				union(a, b);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int ver = cin.nextInt();
		int eg = cin.nextInt();
		CycleInUndirectedGraph g = new CycleInUndirectedGraph(ver, eg, size);
		for(int i = 0; i < eg; i++) {
			g.pair[i].u = cin.nextInt();
			g.pair[i].v = cin.nextInt();
		}
		if(g.isCycle(g)) {
			System.out.println("cycle ase...");
		}
		else System.out.println("cycle nai...");
		
		cin.close();
	}
}

/*
cycle ase.
4 4
1 2
2 3
3 4
4 2

cycle nai.
4 3
1 2
2 3
3 4

*/
