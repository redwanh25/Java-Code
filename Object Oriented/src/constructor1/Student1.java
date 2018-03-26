package constructor1;

class Redwan{
	private int id;
	private String name;
	private int age;
	
	public Redwan(){
		
	}
	public Redwan(int id) {
		this.id = id;
	}
	public Redwan (int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void res() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}


public class Student1 {

	public static void main(String[] args) {
		Redwan red = new Redwan(171, "ramij", 19);
		Redwan re = new Redwan(172);
		Redwan r = new Redwan();
		red.res();
		re.res();
		r.res();
	}

}
