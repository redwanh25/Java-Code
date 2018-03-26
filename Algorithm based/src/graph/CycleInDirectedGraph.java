package graph;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class CycleInDirectedGraph {

	private int vertex, edge;
	private LinkedList <Integer> adj[];
	private LinkedHashSet <Integer> set;
	private boolean[] vis;
	private boolean[] stack;
	
	public CycleInDirectedGraph(int vertex, int edge, int size){
		this.vertex = vertex;
		this.edge = edge;
		set = new LinkedHashSet<> ();
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
		vis = new boolean[size];
		stack = new boolean[size];
	}
	
	public boolean dfs(int u) {
		if(vis[u] == false) {
			vis[u] = true;
			stack[u] = true;
			Iterator <Integer> it = adj[u].iterator();
			while(it.hasNext()) {
				int v = it.next();
				if(vis[v] == false && dfs(v)) {
					return true;
				}
				else if(stack[v] == true) {
					return true;
				}
			}
		}
		stack[u] = false;
		return false;
	}
	
	public boolean isCycle() {
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			if(dfs(it.next())) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int ver = cin.nextInt();
		int eg = cin.nextInt();
		CycleInDirectedGraph g = new CycleInDirectedGraph(ver, eg, size);
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			g.adj[a].add(b);
			g.set.add(a);
			g.set.add(b);
		}
		if(g.isCycle()) {
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

4 6
0 1
0 2
1 2
2 0
2 3
3 3

cycle nai.
4 3
1 2
2 3
3 4

*/
