package besic;

public class As_a_Argument {
	
	interface Inner {					// class er vitore o interface likha jay
		int string(String s);
	}
	
	public static void print(Inner r) {
		System.out.println(r.string("redwan"));
	}
	
	public static void main(String[] args) {
		print(s -> {
			int a = 5;
			System.out.println(a);
			return s.length();
		});
	}
}
