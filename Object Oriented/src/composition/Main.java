package composition;

public class Main {

	public static void main(String[] args) {
		Dimension2 dimensions = new Dimension2(20, 20, 5);
		Case5 Case = new Case5("220B", "Dell", "240", dimensions);
//		Resolution1 resolution = new Resolution1(1920, 1080);
		Monitor4 monitor = new Monitor4("27 inch", "Acer", 27, new Resolution1(1920, 1080));
		Motherboard3 motherboard = new Motherboard3("BJ", "asus", 4, 5, "V2.44");
		Pc6 pc = new Pc6(Case, monitor, motherboard);
		pc.getTheCase().pressPowerButton();
		pc.getMonitor().drawPixelAt(1500, 1200, "red");
		pc.getMotherboard().loadProgram("windows - 10");
		
		pc.getMonitor().getNativeResolution().print();
	}
}
