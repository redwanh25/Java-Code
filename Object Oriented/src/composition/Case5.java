package composition;

public class Case5 {
	private String model;
	private String manufacturer;
	private String powerSupply;
	private Dimension2 dimensions;
	public Case5(String model, String manufacturer, String powerSupply, Dimension2 dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}
	public void pressPowerButton() {
		System.out.println("Power Button Pressed");
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimension2 getDimensions() {
		return dimensions;
	}
	
}
