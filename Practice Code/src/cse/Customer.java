package cse;

abstract class User {
	
	protected String userid;
	protected String passwd;

	public User(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
	
	public abstract void display();
}

public class Customer extends User {

	protected String name;
	protected String email;
	
	public Customer(String userid, String passwd, String name, String email) {
		super(userid, passwd);
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void display() {
		System.out.println(userid + "\n" + passwd + "\n" + name + "\n" + email);
	}
	
	public static void main(String[] args) {
		Customer cust = new Customer("171", "12345", "Redwan", "redwanh25@gmail.com");
		cust.display();
	}
}
