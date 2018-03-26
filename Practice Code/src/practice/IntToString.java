package practice;

public class IntToString {

	public static void main(String[] args) {
		int a = 10;
		String s1, s2 = "" + a;
//		String s2 = a;		// ai vabe hobe na. error hobe.  akta "" ai rokom diye tarpor int num deoya jabe. 
		double b = 5.56;
		s1 = "ami " + b;
		System.out.println(s2 + " " + s1.charAt(0) + " " + s1);

	}

}
