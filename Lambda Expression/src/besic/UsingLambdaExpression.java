package besic;

/*
 *  lambda expression just "interface" er jonno use kora jay.
 *  kono "class" / "abstract class" er jonno use kora jay na.
 *  akta interface er moddhe just aktai abstract method thakbe
 *  
 */

interface Lambda1 {
	int add(int a, int b);		// amra chile kintu akta interface a onek gulu methed likhte parbo na. karon jodi amra onek gula method likhi taile amrader
								// lamda expression confusion hoye porbe j amra kake call kortesi.
//	int add3();		// ai line ta likhle amader lambda expression r kaj korbe na. error show korbe.
}
interface Lambda2 {
	void print();				// akta interface er moddhe akta method e thakbe
}

interface Lambda3 {
	String subtract(String s);
}

@FunctionalInterface		// er mane hosse amra ai interface er moddhe just aktai abstract method likhte parbo.
interface Lambda4 {
	int string(String s);
//	String subtract(String s);		// aita likhle error dibe
}

public class UsingLambdaExpression {

	public static void main(String[] args) {
		
		Lambda1 l0 = new Lambda1() {
			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		int sum_0 = l0.add(2, 5);
		System.out.println(sum_0);
		
		Lambda1 l = (int a, int b) -> a + b;	// "return (a+b)" likha jabe na without "curly bases { ____ }"
		
//		Lambda1 l = (int a, int b) -> {
//			return a + b;
//		};
		
		int sum = l.add(2, 5);
		System.out.println(sum);
		
		Lambda1 l1 = (a, b) -> a + b;			// aivabe o likha jay. (int a, int b) na likhe
		int sum1 = l1.add(3, 5);
		System.out.println(sum1);
		
		Lambda2 l2 = () -> System.out.println("hello");
		l2.print();
		
		Lambda3 l3 = (String s) -> {						
			int a = 5;
			int b = 3;
			if(b == 0) return "subtract by 0";
			System.out.println(a-b);
			return s;
		};
		System.out.println(l3.subtract("redwan"));
		
		Lambda4 l4 = s -> s.length();				// akta variable thakle (s) ai vabe na likhe just "s" likhle o hobe
		System.out.println(l4.string("ramij"));
	}
}
