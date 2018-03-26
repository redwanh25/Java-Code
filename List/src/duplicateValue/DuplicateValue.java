package duplicateValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateValue {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Collections.fill(list, 4);
		for(Integer i : list) {
			System.out.println(i);
		}
		Integer[] data = new Integer[5];
		Arrays.fill(data,new Integer(13));
		for(int i : data) {
			System.out.println(i);
		}
	}
}
