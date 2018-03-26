package constructor3;

public class Student3 {
	double number;
	String id;
	String name;
	int no;
	
	Student3(){
		number = 9.8;
		id = "171-15-2445";
		name = "redwan Hossain";
		no = 12;
	}
	
	Student3(double number, String id, String name, int no){
		this.number = number;		// number = number;
		this.id = id;				// id = id;
		this.name = name;			// name = name;
		this.no = no;				// no = no;		 just ai gulo dile hobe na. "this" dite hobe. karon argument r global veriable same hoye jabe.
									// er jonno "this" na dite chaile argument ta alada nam er nite hobe.
	}
	
	public double mul() {
		return ((int)number * no); 		//  return (int)(number * no);
	}
	
	public void prnt() {
		System.out.println(number + " " + id + " " + name + " " + no);
	}
	
	public double getNumber() {
		return number;
	}
	public void setNumber(double a) {
		number = a;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

}
