package graph;

import java.util.Scanner;

public class ShortestPath_FloydWarshall {

	private int vertex, edge;
	private int[][] adj;
	private int inf = Integer.MAX_VALUE;
	
	public ShortestPath_FloydWarshall(int vertex, int edge, int size) {
		this.vertex = vertex;
		this.edge = edge;
		adj = new int[vertex][vertex];
	}
	
	public void floydWarshall() {
	    for(int k = 0; k < vertex; k++){
	        for(int i = 0; i < vertex; i++){
	            for(int j = 0; j < vertex; j++){
	                if((adj[i][k] != inf && adj[k][j] != inf) && adj[i][j] > adj[i][k] + adj[k][j]){
	                    adj[i][j] = adj[i][k] + adj[k][j];
	                }
	            }
	        }
	    }
	    for(int i = 0; i < vertex; i++){
	        if(adj[i][i] != 0){
	            System.out.println("there is a negative weighted graph...");
	            return;
	        }
	    }
	    
	    for(int a[] : adj) {
	    	for(int i : a) {
	    		if(i == inf) {
	    			System.out.print("inf      ");
	    		}
	    		else System.out.print(i + "       ");
	    	}
	    	System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		ShortestPath_FloydWarshall g = new ShortestPath_FloydWarshall(v, eg, size);
		for(int i = 0; i < v; i++) {
			for(int j = 0; j < v; j++) {
				g.adj[i][j] = g.inf;
			}
		}
		for(int i = 0; i < eg; i++) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int wt = cin.nextInt();
			g.adj[a][b] = wt;
//			g.adj[b][a] = wt;		// for undirected graph

		}
		for(int i = 0; i < v; i++) {
			g.adj[i][i] = 0;
		}
		g.floydWarshall();
		cin.close();
	}
}

/*
input:
5 8
0 1 -1
0 2 4
1 2 3
1 3 2
1 4 2
3 2 5
3 1 1
4 3 -3

output:
0     -1    2     -2    1
Inf   0     3     -1    2
Inf   Inf   0     Inf   Inf
Inf   1     4     0     3
Inf   -2    1     -3    0

input:
4 4
0 1 5
0 3 10
1 2 3
2 3 1

negative wighted circle
4 4
0 1 1
1 2 -5
2 3 2
3 1 2

*/
