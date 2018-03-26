package basic;

class Type <X, Y> {
	protected X x;
	protected Y y;
	
	public Type() {
	}
	
	public Type(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	public X getx(X x) {
		return x;
	}
	public Y gety(Y y) {
		return y;
	}
	public void print() {
		System.out.println(x.getClass().getName() + "  " + x);
		System.out.println(y.getClass().getName() + "  " + y + "\n");
	}
}

public class MultipleType {
	public static void main(String[] args) {
//		Type <Integer, String> type = new Type<Integer, String>(45, "Redwan");
		Type <Integer, String> type = new Type<>(45, "Redwan");	// same as upper line. ata k "Verbosity" bole
		type.print();						 // (45, "Redwan") ai khane amra constructor er argument nisi.
		
		Type <Integer, Integer> type1 = new Type<>();
		int a = type1.getx(54);
		int b = type1.gety(398);
		System.out.println(a + " " + b);

//		nicher ai kaj tao kora jay but, ai code a kora jabe na. 
		
//		Type <String , Type <String, Integer> > type2 = new Type <String, Type <String, Integer> >("Ramij", new Type<String, Integer>("nipu", 420));
//		Type <String, Type <String, Integer> > type2 = new Type <>("Ramij", new Type<>("nipu", 420));	// same as upper line...

	}
}