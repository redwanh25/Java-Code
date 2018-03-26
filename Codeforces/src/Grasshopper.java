import java.util.Scanner;

public class Grasshopper {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		char[] str = s.toCharArray();
		int cnt = 0, r = 0;
		for(int i = 0; i <= str.length; i++) {
			r++;
			try {
				if(str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U' || str[i] == 'Y') {
					cnt = Math.max(cnt, r);
					r = 0;
				}
			}
			catch (Exception e) {
				cnt = Math.max(cnt, r);
			}
		}
		System.out.println(cnt);
		cin.close();
	}

}
