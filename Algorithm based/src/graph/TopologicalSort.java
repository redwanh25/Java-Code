package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {
	
	private boolean[] vis;
	private ArrayList <Integer> adj[];
	private Stack <Integer> stack;
	private LinkedHashSet <Integer> set;
	
	public TopologicalSort(int size) {
		vis = new boolean[size];
		adj = new ArrayList[size];
		for(int i = 0; i < size; i++) {
			adj[i] = new ArrayList<>();
		}
		stack = new Stack<>();
		set = new LinkedHashSet<>();
	}
	
	public void dfs(int u) {
		vis[u] = true;
		Iterator <Integer> it = adj[u].iterator();
		while(it.hasNext()) {
			int a = it.next();
			if(vis[a] == false) {
				dfs(a);
			}
		}
		stack.add(u);
	}
	
	public void t_sort() {
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()){
			int a = it.next();
			if(vis[a] == false) {
				dfs(a);
			}
		}
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		TopologicalSort g = new TopologicalSort(size);
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			g.adj[a].add(b);
			g.set.add(a);
			g.set.add(b);
		}
		g.t_sort();
		cin.close();
	}
}

/*

8 8
1 3
2 3
2 5
3 4
4 6
4 7
5 7
7 8

7 7
1 3
2 3
3 4
2 5
4 6
5 6
6 7

*/