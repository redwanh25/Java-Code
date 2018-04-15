

// this is not a complete code.. aita wrong code

package problem_solving;

import java.util.*;

public class SearchingQuickly_123 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		TreeMap <String, String> treeMap = new TreeMap <> ();
		String ignore = "", ignore1;
		while(true){
			ignore1 = cin.nextLine();
			if(ignore1.equals("::")) {
				break;
			}
			ignore += (ignore1 + " ");
		}
	//	System.out.println(ignore);
		while(cin.hasNextLine()) {
			String str = cin.nextLine().toLowerCase();
			//System.out.println(str);
			String[] div = str.split(" ");
			String[] div1 = new String[20];
			
			for(int i = 0; i < div.length; i++) {
				if(!ignore.contains(div[i])) {
					div1[i] = div[i].toUpperCase();
					String str2 = str.replace(div[i], div1[i]);
					treeMap.put(div1[i] + str.length() + str.indexOf(div[i]), str2);
				}
			}
		//	System.out.println(treeMap);
		} 
		
		Iterator<String> it = treeMap.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Iterator<String> it1 = treeMap.keySet().iterator();
//		while(it1.hasNext()) {
//			System.out.println(it1.next());
//		}
		
		cin.close();
	}
}

/*
 
is
the
of
and
as
a
but
::
A Portrait of The Artist As a Young Man
*/
