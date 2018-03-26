package cse;

class Student_R {
	private String name, id;
	public Student_R(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
}
class Employees extends Student_R {
	private int salary;
	private double workingHour;
	public Employees(String name, String id, int salary, double workingHour) {
		super(name, id);
		this.salary = salary;
		this.workingHour = workingHour;
	}
	public int getSalary() {
		return salary;
	}
	public double getWorkingHour() {
		return workingHour;
	}
}

class Faculty extends Employees {
	private String department;
	private int numberOfCourse;
	public Faculty(String name, String id, int salary, double workingHour, String department, int numberOfCourse) {
		super(name, id, salary, workingHour);
		this.department = department;
		this.numberOfCourse = numberOfCourse;
	}
	public String getDepartment() {
		return department;
	}
	public int getNumberOfCourse() {
		return numberOfCourse;
	}
}
class Admin extends Employees{
	public Admin(String name, String id, int salary, double workingHour) {
		super(name, id, salary, workingHour);
	}
}
class Stuff extends Employees{
	public Stuff(String name, String id, int salary, double workingHour) {
		super(name, id, salary, workingHour);
	}
}

public class Task4 {

	public static void main(String[] args) {
		Student_R student = new Student_R("Redwan", "171-15-8557");
		Faculty faculty = new Faculty("Ramij", "171-15-8625", 70_000, 6, "CSE", 4);
		Admin admin = new Admin("Shihab", "171-15-8955", 40_000, 7);
		Stuff stuff = new Stuff("Reya", "171-15-8743", 30_000, 9);
		
		System.out.println(student.getName());
		System.out.println(student.getId() + "\n");
		
		System.out.println(faculty.getName());
		System.out.println(faculty.getId());
		System.out.println(faculty.getDepartment());
		System.out.println(faculty.getNumberOfCourse());
		System.out.println(faculty.getSalary());	
		System.out.println(faculty.getWorkingHour() + "\n");
		
		System.out.println(admin.getName());
		System.out.println(admin.getId());
		System.out.println(admin.getSalary());	
		System.out.println(admin.getWorkingHour() + "\n");
		
		System.out.println(stuff.getName());
		System.out.println(stuff.getId());
		System.out.println(stuff.getSalary());	
		System.out.println(stuff.getWorkingHour());		
	}
}
