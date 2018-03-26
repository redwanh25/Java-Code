package inheritance;

public class Polygon {
	public int height;
	private int weight;		// static na thakle object toiri kora sara emon kono function a
							// veriable ta access kora jabe na jekhane static ase...
//	public static void redwan() {
//		height = 6;		// ai khane use kora jabe na.
//	}
	public void setValue(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	public int getHeight() {	// aikhane jabe karon ai khane static nai.
		return height;		
	}
	public int getWeight() {
		return weight;
	}
}
