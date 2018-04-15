package problem_solving;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TheDepartmentOfRedundancyDepartment_484 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Map <Integer, Integer> map = new LinkedHashMap<> ();
		int arr[] = new int[65530];
		int neg[] = new int[65530];
		int pos[] = new int[65530];
		while(cin.hasNext()) {
			int key = cin.nextInt();
			int p = Math.abs(key);
			if(key < 0) {
				++neg[p];
				map.put(key, ++arr[p] - pos[p]);
			}
			else {
				++pos[p];
				map.put(key, ++arr[p] - neg[p]);
			}
			
		}
		
		Iterator <Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int x = it.next();
			System.out.println(x + " " + map.get(x));
		}
		
		cin.close();
	}

}
