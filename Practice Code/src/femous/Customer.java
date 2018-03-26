package femous;

class User {
	protected String userid;
	protected String passwd;
	public User(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	public void display() {
		System.out.println(userid + " , " + passwd);
	}
}

public class Customer extends User {

	private String name;
	private String email;
	public Customer(String userid, String passwd, String name, String email) {
		super(userid, passwd);
		this.name = name;
		this.email = email;
		
	}

	public static void main(String[] args) {
		User cus = new Customer("171", "123" , "redwan" , "diu.edu.bd");
		Item i = new Item("car", 1);
		i.display();
		cus.display();
	}
}

class Item {
	private String itemName;
	private double price;
	public Item(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public void display() {
		System.out.println(itemName + " , " + price);
	}
}