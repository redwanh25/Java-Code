package cse;

import java.util.Scanner;

class Student1 {
	private String grade;
	public String getValue() {
		return grade;
	}
	public void setValue(String grade) {
		this.grade = grade;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Student1 std = new Student1();
		double mark = cin.nextDouble();
		if(mark > 80) {
			std.setValue("A+");
		}
		else if(mark < 80) {
			std.setValue("B+");
		}
		System.out.println(std.getValue());
		cin.close();
	}
}
/* 
 * you said that, "To set the Grade considers these conditions: If, mark is greater than 80,
 * then set the Grade to A+ or if mark is less than 80, then set the Grade to B+ ".
 * So, if input is 80 then my code will give a null output.
 * 
*/