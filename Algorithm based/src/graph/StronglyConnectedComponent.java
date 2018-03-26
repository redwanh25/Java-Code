package graph;

//  (kosaraju's algorithm)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;

public class StronglyConnectedComponent {

	private ArrayList <Integer> adj[];		// private ArrayList <Integer> adj[], adj_t[];
	private ArrayList <Integer> adj_t[];	// uporer ai vabe likhle hobe na. (be careful)
	private LinkedHashSet <Integer> set;
	private boolean vis[];
	private Stack <Integer> stack;
	private int vertex, edge;
	
	public StronglyConnectedComponent(int vertex, int edge, int size) {
		adj =  new ArrayList[size];
		adj_t = new ArrayList[size];	// adj = adj_t = new ArrayList[size];	 ai vabe likhle hobe na.
		for(int i = 0; i < size; i++) {
			adj[i] = new ArrayList<>();
			adj_t[i] = new ArrayList<>();
		}
		vis = new boolean[size];
		this.vertex = vertex;
		this.edge = edge;
		stack = new Stack<>();
		set = new LinkedHashSet<> ();
	}
	
	public void dfs(int u) {
		vis[u] = true;
		System.out.print(u + " ");
		Iterator <Integer> it = adj_t[u].iterator();
		while(it.hasNext()) {
			int a = it.next();
			if(vis[a] == false) {
				dfs(a);
			}
		}
	}
	
	public void dfs_stack(int u) {
		vis[u] = true;
		Iterator <Integer> it = adj[u].iterator();
		while(it.hasNext()) {
			int a = it.next();
			if(vis[a] == false) {
				dfs_stack(a);
			}
		}	
//		for(int i = 0; i < adj[u].size(); i++) {
//			if(vis[adj[u].get(i)] == false) {
//				dfs_stack(adj[u].get(i));
//			}
//		}
		stack.add(u);
	}
	
	public void scc() {
		
//		for(ArrayList<Integer> x : adj) {
//				System.out.println(x);
//		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int a = it.next();
			if(vis[a] == false) {
				dfs_stack(a);
			}
		}
		Arrays.fill(vis, false);
		int cnt = 0;
		System.out.println("strongly connected component");
		while(!stack.empty()) {
			int a = stack.pop();
			if(vis[a] == false) {
				dfs(a);
				System.out.println();
				cnt++;
			}
		}
		System.out.println("number of strongly connected component : " + cnt);
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		StronglyConnectedComponent g = new StronglyConnectedComponent(v, eg, size);
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			g.adj[a].add(b);
			g.adj_t[b].add(a);
			g.set.add(a);
			g.set.add(b);
		}
		g.scc();
		cin.close();
	}
}

/*

9 10
0 1
1 2
2 3
3 0
2 4
4 5
5 6
6 4
7 6
7 8

strongly connected component
7
8
0 3 2 1
4 6 5
number of strongly connected component : 4

4 6
0 1
0 2
1 2
2 3
0 3
3 0

*/
