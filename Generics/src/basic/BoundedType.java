package basic;

class Temp2	<T extends Number> {	// <T extends Number> er mane "T" hosse emon class hobe ja "Number" class er subclass
									// Number class er subclass hosse "Integer, Double, Float, Long, Short, BigInteger, BigDecimal, Byte, etc..."
	private T[] type;
	public Temp2(T[] type) {
		this.type = type;
	}
	public void result() {
//		Integer sum = 0;
		Double sum = 0d;
		for(T i : type) {
//			sum += i.intValue();
//			sum += i.doubleValue();
			sum += (float) i;
		}
		System.out.println(sum);
		
		for(Object i : type) {		// shob class e "object" class er subclass.
			sum += (float) i;
		}
		System.out.println(sum);
	}
}

public class BoundedType {

	public static void main(String[] args) {
		Temp2 <Float> tmp = new Temp2<>(new Float[] {1f, 2f, 3.5f, 4.6f, 5.0f});		// "1f" likhle r casting kore (double) likhte hobe na.
		tmp.result();	// karon java te "2.0" dile aita autometic "double" dhore ney. so, "float" korte chaile "double" a casting korte hobe. 
	}
}
