package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pair2 {
	private Integer wt, v1, v2;

	public Pair2(Integer v1, Integer v2,Integer wt) {
		this.v1 = v1;
		this.v2 = v2;
		this.wt = wt;
	}
	public Integer getV1() {
		return v1;
	}
	public Integer getV2() {
		return v2;
	}
	public Integer getWt() {
		return wt;
	}
}

public class MST_Kruskal {
	
	private int vertex, edge;
	private ArrayList <Pair2> adj;
	private int[] node;
	
	public MST_Kruskal(int vertex, int edge, int size) {
		this.vertex = vertex;
		this.edge = edge;
		adj = new ArrayList<>();
		node = new int[size];
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
	
	public int kruskal() {
		Collections.sort(adj, new Comparator<Pair2>() {
			@Override
			public int compare(Pair2 o1, Pair2 o2) {
				return o1.getWt().compareTo(o2.getWt());
			}			
		});
		int a, b, wt, eg = 0, v = 0, sum = 0;
		while(v < vertex-1 || eg < edge) {
			a = adj.get(v).getV1();
			b = adj.get(v).getV2();
			wt = adj.get(v).getWt();
			if(find(a) != find(b)) {
				union(a, b);
				sum += wt;
				System.out.println(a + " --> " + b);
				v++;
			}
			eg++;
		}
		return sum;
	}
	
//	public void addEdge(int a, int b, int wt) {
//		adj.add(new Pair2(wt, a, b));
//	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int size = 200;
		int v = cin.nextInt();
		int eg = cin.nextInt();
		MST_Kruskal g = new MST_Kruskal(v, eg, size);
		for(int i = 0; i < eg; i++) {
			g.adj.add(new Pair2(cin.nextInt(), cin.nextInt(), cin.nextInt()));
		}
		System.out.println("total cost : " + g.kruskal());
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

*/
