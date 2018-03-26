package constructor1;

class Parent {
	private String name;
	private int age;
	public Parent(String tName, int tAge) {
		name = tName;
		age = tAge;
	}
	public void par() {
		System.out.println(name);
	}
}

class Child extends Parent {
	public Child(int a) {
		super("John", 42); // explicit super-call
	}
}

public class Class {

	public Class() {
		Child c = new Child(2);		// constructor er moddhe o object toiri kore kaj kora jay... ki moja..
		c.par();
	}
	
	public static void main(String[] args) {
		Class cls = new Class();
	//	Child c = new Child(2);
	//	c.par();
		
	}

}
