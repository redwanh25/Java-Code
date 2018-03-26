package composition;

public class Pc6 {
	private Case5 theCase;
	private Monitor4 monitor;
	private Motherboard3 motherboard;
	public Pc6(Case5 theCase, Monitor4 monitor, Motherboard3 motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	
	public static void main(String[] args) {
		Case5 c = new Case5("220B", "Dell", "240", new Dimension2(20, 20, 5));
		c.pressPowerButton();
		c.getDimensions().print();
	}
	
	public Case5 getTheCase() {
		return theCase;
	}
	public Monitor4 getMonitor() {
		return monitor;
	}
	public Motherboard3 getMotherboard() {
		return motherboard;
	}
	
}
