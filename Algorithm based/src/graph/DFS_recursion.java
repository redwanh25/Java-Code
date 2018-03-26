package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS_recursion {
	
	private int vertex;
	private LinkedList <Integer> adj[];
	private boolean[] vis;
	
	public DFS_recursion(int v, int size) {
		this.vertex = v;
		adj = new LinkedList[size];
		vis = new boolean[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
	}
	
	public void dfs(int s) {
		vis[s] = true;
		System.out.print(s + " ");
		Iterator <Integer> it = adj[s].iterator();
		while(it.hasNext()) {
			int v = it.next();
			if(vis[v] == false) {
				dfs(v);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		DFS_recursion g = new DFS_recursion(v, size);
		for(int i = 0; i < v; i++) {
			g.addEdge(cin.nextInt(), cin.nextInt());
		}
		g.dfs(1);		// starting vertex  // BFS(1); mane 1 theke shuru hobe
		cin.close();
	}
}

/*
7
1 2
1 5
2 3
2 5
3 4
4 5
4 6

*/
