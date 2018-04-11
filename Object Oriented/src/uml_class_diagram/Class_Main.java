package uml_class_diagram;

class A {
	public void object(B b) {
		b.print1();
	}
}

class B {
	static int a = 6;
	public B() {
		a = 10;
	}
	public void print() {
		System.out.println("redwan");
	}
	public void print1() {
		System.out.println("hossain " + a);
		
	}
}

public class Class_Main {

	public static void main(String[] args) {
		A trt = new A();
		trt.object(new B());

	}

}
