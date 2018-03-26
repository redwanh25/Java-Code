package constructor2;

public class Student2 {
	private static int me = 0;
	double number;
	String id;
	String name;
	int no;
	Student2(){
		me++;
	}
	public static int ami() {
		return me;
	}
}
