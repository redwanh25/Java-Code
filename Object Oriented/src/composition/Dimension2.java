package composition;

public class Dimension2 {
	private int width;
	private int hight;
	private int depth;
	public Dimension2(int width, int hight, int depth) {
		this.width = width;
		this.hight = hight;
		this.depth = depth;
	}
	public void print() {
		System.out.println("Ramij");
	}
	public int getWidth() {
		return width;
	}
	public int getHigth() {
		return hight;
	}
	public int getDepth() {
		return depth;
	}
}
