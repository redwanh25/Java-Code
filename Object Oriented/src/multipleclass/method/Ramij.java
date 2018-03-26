package multipleclass.method;

class Redwan {		// ai khane amra "public class Redwan" likhte parbo na. karon aita amader ashol class na. ashol class hosse Ramij.
	protected int a;		// so, Ramij class a amra chaile public likhte pari abr nao likhte pari.. karaon ramij amrader ashol class.  

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

class Ramij{	
	public static void main(String[] args) {		// ashol class er moddhe e amader main method likhte hobe..
		Redwan r = new Redwan();					// onno method a likhle hobe na.. likhle main method k khuje pabe na.
		r.setA(5);
		System.out.println(r.getA());
	}
}
