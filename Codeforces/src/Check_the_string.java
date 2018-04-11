import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Check_the_string {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		LinkedHashSet <Character> ch = new LinkedHashSet<>();
		String str = new String();
		int[] arr = new int[101];
		str = cin.nextLine();
		char[] red = str.toCharArray();
		int i = 0;
		while(i < red.length) {
			ch.add(red[i]);
			arr[red[i++]]++;
		}
		Iterator <Character> it = ch.iterator();
		
		Character[] chr = {'a', 'b', 'c'};
		List<Character> list = Arrays.asList(chr);
		
		if(list.get(0) == it.next() && list.get(1) == it.next() && list.get(2) == it.next()) {
			if(arr[97] == arr[99] || arr[98] == arr[99]) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}
		cin.close();
	}
}
