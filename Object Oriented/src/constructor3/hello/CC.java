package constructor3.hello;

public class CC {

	public static void main(String[] args) {
		int a, b, res;
		a = 3;
		b = 5;
		res = a + b;
		rrr(res, a, b);
	}
	public static void rrr(int res, int a, int b) {
		System.out.println("result : " + res + " ");
		System.out.println(a + " " + b);
		System.out.print(a + " " + b);
	}

}
