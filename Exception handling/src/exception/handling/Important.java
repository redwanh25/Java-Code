package exception.handling;

public class Important {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			arr[6] = 30/0;				// left side theke kaj shuru hoy age. so, aita ArithmeticException hobe
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
	}

}
