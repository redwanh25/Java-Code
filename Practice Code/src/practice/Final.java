package practice;

public class Final{
	public static void main(String [] args) {
		Check f;
		f = new Check();
		System.out.println(f.a);
	}
}

class Check {
	
	final int a;
	Check(){
		a = 45;
	}
}