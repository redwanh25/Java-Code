package practice;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Scanner;
import java.util.*;

public class sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = new String[3];		// 2d String
		for(int i = 0; i < 3; i++) {
			s[i] = scan.nextLine();
		}
		Arrays.sort(s);		// Ascending order
		for(int i = 0; i < 3; i++) {
			System.out.println(s[i]);
		}
		Arrays.sort(s, Collections.reverseOrder());	// descending order
		Arrays.sort(s, 0, 3);
		for(int i = 0; i < 3; i++) {
			System.out.println(s[i]);
		}
		scan.close();
	}

}


//import java.util.Arrays;
//
//public class sort
//{
//    public static void main(String[] args)
//    {
//        String original = "edcba";
//        char[] chars = original.toCharArray();
//        System.out.println(chars.length);
//        char[] ch = new char[7];
//        Arrays.sort(chars);
////      String sorted = new String(chars);
////      System.out.println(sorted);
//		original = String.valueOf(chars);
//		System.out.println(original);
//		System.out.println(chars);
//		System.out.println(chars[0]);
//		System.out.println(original.charAt(0));
//    }
//}


