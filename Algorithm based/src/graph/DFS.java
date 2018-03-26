package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DFS {

	private int vertex;
	private LinkedList <Integer> adj[];
	private boolean[] vis;
	
	public DFS(int v, int size) {
		this.vertex = v;
		vis = new boolean[size];
		adj = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int a, int b) {
		adj[a].add(b);
		adj[b].add(a);
	}
	
	public void dfs(int s) {
		int[] edge = new int[vertex];
		Stack <Integer> stack = new Stack<>();
		System.out.print(s + " ");
		vis[s] = true;
		stack.add(s);
		while(!stack.isEmpty()) {
			int u = stack.pop();			
			while(edge[u] < adj[u].size()) {
				int v = adj[u].get(edge[u]);
				edge[u]++;
				if(vis[v] == false) {
					vis[v] = true;
					System.out.print(v + " ");
					stack.add(v); stack.add(u);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		DFS g = new DFS(v, size);
		for(int i = 0; i < v; i++) {
			g.addEdge(cin.nextInt(), cin.nextInt());
		}
		g.dfs(1); 		// starting vertex  // BFS(1); mane 1 theke shuru hobe
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

