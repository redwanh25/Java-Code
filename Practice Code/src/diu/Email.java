package diu;

public class Email {

	public static void main(String[] args) {
		String e = "redwan@";
		String substring = e.substring(e.length()-11, e.length());
        if(!substring.equals("@diu.edu.bd")) {
            System.out.println("no");
        }
        else System.out.println("yes");

	}

}
