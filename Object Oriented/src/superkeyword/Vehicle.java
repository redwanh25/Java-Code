package superkeyword;

public class Vehicle {

	public int speed;
	public int gear;
	public String name;
	public int[] arr = new int[5];
	
	Vehicle(int a, int b, String s){
		speed = a;
		gear = b;
		name = s;
	}
	
	public void gearup(int up) {
		speed += up;
	}
	public void geardown(int down) {
		speed -= down;
	}
	public int cal() {
		return (speed * gear);
	}
}
