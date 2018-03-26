package inheritance;

//import inheritance.Polygon;

public class Rectangle extends Polygon {

	public int area(){
		Polygon pol = new Polygon();
		pol.setValue(10, 10);
		return (pol.getHeight() * pol.getWeight());
	}

}
