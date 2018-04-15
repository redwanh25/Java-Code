package problem_solving;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordIndex_417 {

	public static void main(String[] args) {
		int a = 0;
		Map <String, Integer> map = new LinkedHashMap<>();
		for(char i = 'a'; i <= 'z'; i++) {
			map.put(String.valueOf(i), ++a);
		}
		for(char i = 'a'; i <= 'z'; i++) {
			for(char j = (char) (i+1); j <= 'z'; j++) {
				map.put(String.valueOf(i + "" + j), ++a);
			}
		}
		for(char i = 'a'; i <= 'z'; i++) {
			for(char j = (char) (i+1); j <= 'z'; j++) {
				for(char k = (char) (j+1); k <= 'z'; k++) {
					map.put(String.valueOf(i + "" + j + "" + k), ++a);
				}
			}
		}
		for(char i = 'a'; i <= 'z'; i++) {
			for(char j = (char) (i+1); j <= 'z'; j++) {
				for(char k = (char) (j+1); k <= 'z'; k++) {
					for(char l = (char) (k+1); l <= 'z'; l++) {
						map.put(String.valueOf(i + "" + j + "" + k + "" + l), ++a);
					}
				}
			}
		}
		for(char i = 'a'; i <= 'z'; i++) {
			for(char j = (char) (i+1); j <= 'z'; j++) {
				for(char k = (char) (j+1); k <= 'z'; k++) {
					for(char l = (char) (k+1); l <= 'z'; l++) {
						for(char m = (char) (l+1); m <= 'z'; m++) {
							map.put(String.valueOf(i + "" + j + "" + k + "" + l + "" + m), ++a);
						}
					}
				}
			}
		}
		
//		Iterator <String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(a);
		
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			String str = cin.next();
			System.out.println(map.containsKey(str) ? map.get(str) : "0");
		}
		cin.close();
	}
}
