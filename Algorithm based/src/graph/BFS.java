package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BFS {

	private int vertex;
	private LinkedList <Integer> adj[];
	private boolean[] vis;
	
	public BFS (int v, int size) {
		this.vertex = v;
		vis = new boolean[size];		// by default false
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b) {
		
//		for undirected graph
		adj[a].add(b);
		adj[b].add(a);
		
//		for directed graph
//		adj[a].add(b);
	}
	
	public void bfs(int s) {
		LinkedList <Integer> q = new LinkedList<>();
		q.add(s);
		vis[s] = true;
		while(!q.isEmpty()) {
			int u = q.pollFirst();
			System.out.print(u + " ");		// output will be print
			Iterator <Integer> it = adj[u].iterator();
			while(it.hasNext()) {
				int v = it.next();
				if(vis[v] == false) {
					vis[v] = true;
					q.add(v);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		BFS g = new BFS(v, size);
		for(int i = 0; i < v; i++) {
			g.addEdge(cin.nextInt(), cin.nextInt());
		}
		g.bfs(1);		// starting vertex  // BFS(1); mane 1 theke shuru hobe
		cin.close();
	}

}
