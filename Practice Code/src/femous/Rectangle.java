package femous;

public class Rectangle {
	
	private int height, width;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int calculateArea() {
		return height * width;
	}
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		rec1.setHeight(2);
		rec1.setWidth(3);
		int r1 = rec1.calculateArea();
		rec2.setHeight(4);
		rec2.setWidth(5);
		int r2 = rec2.calculateArea();
		System.out.println((r1 > r2) ? r1 : r2);
	}
}
