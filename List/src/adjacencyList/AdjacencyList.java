package adjacencyList;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List <Integer>[] list = new ArrayList[5];
		
		for(int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<>();
		}
		
		list[0].add(1);	list[0].add(2);	list[0].add(3);
		list[1].add(4);	list[1].add(5);
		list[2].add(6);
		list[3].add(7);	list[3].add(8);
		list[4].add(9);	list[4].add(10);	list[4].add(11);
		
//		for(int i = 0; i < list.length; i++){
//			System.out.println(list[i]);			
//		}
		
		for(List<Integer> i : list) {
			System.out.println(i);
		}
		
//		for(List<Integer> x : list) {
//			for(Integer i : x) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < list[i].size(); j++) {
//				System.out.print(list[i].get(j) + " ");
//			}
//			System.out.println();
//		}
		
	}
}
