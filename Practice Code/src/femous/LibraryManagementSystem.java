package femous;

public class LibraryManagementSystem {
	
	private int state1;
	private int state2;
	private int state3;
	
	public LibraryManagementSystem(int state1, int state2, int state3) {
		this.state1 = state1;
		this.state2 = state2;
		this.state3 = state3;
	}
	
	public void behaviors1() {
		// write something
		return;
	}
	public void behaviors2() {
		// write something
		return;
	}
	public void behaviors3() {
		// write something
		return;
	}
	
	public static void main(String[] args) {
		LibraryManagementSystem object1 = new LibraryManagementSystem(1, 2, 3);
		LibraryManagementSystem object2 = new LibraryManagementSystem(4, 5, 6);
		
		System.out.println(object1.state1);
		System.out.println(object1.state2);
		System.out.println(object1.state3);
		
		object2.behaviors1();
		object2.behaviors2();
		object2.behaviors3();
	}
}
