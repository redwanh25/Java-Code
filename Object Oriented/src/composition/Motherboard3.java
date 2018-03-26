package composition;

public class Motherboard3 {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	public Motherboard3(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
	}
	public void loadProgram(String name) {
		System.out.println(name);
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamSlots() {
		return ramSlots;
	}
	public int getCardSlots() {
		return cardSlots;
	}
	public String getBios() {
		return bios;
	}
	
}
