package magic;

import java.util.Arrays;
import java.util.Comparator;

class InnerClass{
	
    class Edge {
        Integer src, dest, weight;
//        Edge() {
//            src = dest = weight = 0;
//        }     
    }
    
    int V, E;
    private Edge edge[];
 
    InnerClass(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i) {
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        InnerClass graph = new InnerClass(2, 2);
 
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 4;
 
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = -1;
 
        for(int i = 0; i < 2; i++) {
        	System.out.println(graph.edge[i].src + " " + graph.edge[i].dest + " " + graph.edge[i].weight);
        }
        
        Arrays.sort(graph.edge, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {		//	"Edge" akta Array ai jonno Arrays.sort use kora hoise.
				return o1.weight.compareTo(o2.weight);
			}
        });
        
        System.out.println("\nsorted");
        for(int i = 0; i < graph.edge.length; i++) {
        	System.out.println(graph.edge[i].src + " " + graph.edge[i].dest + " " + graph.edge[i].weight);
        }
    }
}
