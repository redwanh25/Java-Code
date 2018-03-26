package practice;

public class Str {

	public static void main(String[] args) {
		String s = "I Love YOU";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.indexOf('Y'));
		System.out.println(s = s.concat(" Redwan"));
		System.out.println(s.replace('o', '0'));

		String str = "Hi There";
		char[] arr = str.toCharArray();

		for(int i=0;i<arr.length;i++)
		    System.out.print(" "+arr[i]);
		
		System.out.println();
		
		String st = "Hi There";
		char[] ar = new char[10]; // = st.toCharArray();
		ar[6] = 'U';
	    System.out.println(ar); // ar[6]
		
	    String red = "Hi there";
	    char[] myNameChars = red.toCharArray();
	    myNameChars[4] = 'X';
	    red = String.valueOf(myNameChars);
	    
	    for (int i = 0; i < red.length(); i++) {
	        System.out.print(" " + red.charAt(i));
	    }

	    System.out.println(red);
	    
	}
}
