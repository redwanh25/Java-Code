package parameter.as.a.object;

public class Parameter {
	private String s;
	public static void main(String[] args) {
		Parameter per = new Parameter();
		per.s = "Redwan";
		System.out.println(per.s);
	//	Parameter p = new Parameter();
	//	per.red(p);
		per.red(new Parameter());
		Redwan r = new Redwan();
		r.ami();
		Red1 rr = new Red1();
		rr.ami();
	}
	void red(Parameter per1) {		// per1 = p hoye gese
		per1.s = "Nazia";
		System.out.println(per1.s);
	}
	
	
	static class Redwan{		// static dite hobe
		public void ami() {
			System.out.println("redwan");
		}
	}

}

class Red1{
	public void ami() {
		System.out.println("redwan hossian");
	}
}


