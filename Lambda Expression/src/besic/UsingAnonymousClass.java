package besic;

interface Lambda {
	int add(int a, int b);
}

public class UsingAnonymousClass {

	public static void main(String[] args) {
		Lambda l = new Lambda() {
			@Override
			public int add(int a, int b) {
				return a+b;	
			}
		};
		int sum = l.add(2, 5);
		System.out.println(sum);
	}
}


