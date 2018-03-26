package superkeyword;

public class MainMain {
	
	public static Vehicle v = new Vehicle(9, 8, "ami");
	public static Car c  = new Car(2);
	protected static Track t = new Track();
	
	public static void main(String[] args) {
		System.out.println(v.cal());	// 72
		System.out.println(c.cal());	// 18
		System.out.println(c.cal_1());	// 324
		System.out.println(c.cal_2());	// 36
		System.out.println(t.cal());	// 0
	}
}
