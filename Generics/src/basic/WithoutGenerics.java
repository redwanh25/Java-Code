package basic;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List <Object> my1 = new ArrayList <>();
		my1.add("Redwan");
		my1.add("Ramij");
		my1.add(3.1d);
		my1.add(4.5f);
		
		String s1 = (String) my1.get(0);	// casting korte e hobe...
		System.out.println(s1);
		
		List my2 = new ArrayList();
		my2.add("Ramij");
		my2.add("Sadia");
		my2.add(3);
		my2.add(4.5f);
		
		String s = (String) my2.get(0);		// casting korte e hobe...
		System.out.println(s + "\n");
		
		for(int i = 0; i < my2.size(); i++) {
			System.out.println(my2.get(i));
		}
	}
}

//	"List my2 = new ArrayList();" and "List <Object> my1 = new ArrayList <>();" er moddhe kono difference nai.
