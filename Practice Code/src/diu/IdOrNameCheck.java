package diu;

import java.util.Scanner;

public class IdOrNameCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String name = cin.nextLine();
		Boolean check = true;
		for(int i = 0; i < name.length(); i++) {
			if(!(name.charAt(i) >= 'a' && name.charAt(i) <= 'z') && !(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') && !(name.charAt(i) == ' ')) {
				System.out.println("not");
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("done");
		}
	}

}
