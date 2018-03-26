package multipleclass.method;

/*
 * shob class e "Object" class er subclass
 */

public class ObjectClass {
	public static void main(String[] args) {
		String s = new String("Redwan");
		Object obj = s;
		System.out.println(obj);
		
		Object obj1 = new String("nipu");
		System.out.println(obj1);			// downcasting na korleo hoy...
		System.out.println((String)obj1);	// downcasting
		
		Object obj2 = new Integer(420);
		System.out.println(obj2);
		
////	Object obj3 = new Object();
//		Integer[] s1 = (Integer[]) new Object[5];		// emon ta possible na.
////	String s2 = (String) obj3;				// emon ta possible na.
//		s1[0] = 45;
//		System.out.println(s1[0]);
		
		Object obj4 = new Object();
		System.out.println(obj4.getClass().getName());
	}
}
