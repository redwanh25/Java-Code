package composition;

public class Monitor4 {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution1 nativeResolution;
	public Monitor4(String model, String manufacturer, int size, Resolution1 nativeResolution) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	public void drawPixelAt(int x, int y, String colour) {
		System.out.println("Drawing pixel at " + x + "," + y + " in colour " + colour);
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	public Resolution1 getNativeResolution() {
		return nativeResolution;
	}
	
}
