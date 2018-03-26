package cse;

class Student {
	private String ID;
	
	
	private String course;
	
	
	public Student(String ID, String course) {
		this.ID = ID;
		this.course = course;
	}
	public void print_stud_info(){
		System.out.println("Stud info = " + ID + ", " + course);
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Student stud1 = new Student("142-35-111", "CSE215");
		stud1.print_stud_info();
		Student stud2 = new Student("142-35-111", "CSE215");
		stud2.print_stud_info();
	}
}


