package inheritance;

//import inheritance.Rectangle;
//import inheritance.Triangle;

public class MyClass {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.setValue(5, 6);		// inheritance
		tri.setValue(7, 8);		// inheritance
		rec.height = 4;
		System.out.println(rec.height);		// height is a public. so, this will be extends
	//	System.out.println(rec.weight);		// weight is a private. so, this will be not extends
		System.out.println(rec.area() + " " + tri.area());
		System.out.println(rec.getHeight() + " " + rec.getWeight());
		System.out.println(tri.getHeight() + " " + tri.getWeight());

	}

}
