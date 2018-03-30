package femous;

public class Jack {

	public static void main(String[] args) {
		int x = 90;
		int y = 1;
		
//		double res = Math.sin(Math.toRadians(x));
		double res = Math.sin(x * (Math.PI/180));
		
		double res1 = Math.asin(y) * (180/Math.PI);
		
		System.out.println(res);
		System.out.println(res1);
	}

}
