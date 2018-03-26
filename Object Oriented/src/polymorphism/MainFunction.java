package polymorphism;

class Shape{
	public String name;
	public Shape(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class Circle extends Shape {
	public Circle() {
		super("circle");
	}
}

class Square extends Shape {
	public Square() {
		super("square");
	}
}

class Drawing {
	public void draw(Shape sp) {
		System.out.println("Drawing shape : " + sp.getName());
		
//		String subcls = getClass().getTypeName();
//		String supercls = getClass().getSuperclass().getTypeName();
		
		String subcls = sp.getClass().getSimpleName();
		String supercls = sp.getClass().getSuperclass().getSimpleName();
 		//getSimpleName() use korle "package" er ta ashe na just "class" er ta ashe...
		
		System.out.println("Subclass      : " + subcls);
		System.out.println("Superclass    : " + supercls);
		
	}
}


public class MainFunction {

	public static void main(String[] args) {
		
		Shape shape = new Shape("shape");
		Circle circle = new Circle();
		Square square = new Square();
		
		Drawing draw = new Drawing();
		
		draw.draw(shape);
		draw.draw(circle);
		draw.draw(square);

	}

}
