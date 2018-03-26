package constructor2;

import java.util.Scanner;

public class Constructor2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    
		Student2 redwan = new Student2();
		Student2 redwan1 = new Student2();
		Student2 redwan2 = new Student2();
	 //	Student.me = 0;
		redwan.id = scan.nextLine();
		redwan.name = "Redwan hossain";
		redwan.no = 12;
		redwan.number = 13.45;
		
		System.out.println(redwan.id + "\n" + redwan.name + "\n" + redwan.no + "\n" + redwan.number);
		System.out.println(Student2.ami());		// 3
		scan.close();
	}
}
