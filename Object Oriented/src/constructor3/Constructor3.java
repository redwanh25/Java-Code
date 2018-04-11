package constructor3;
import java.util.Scanner;
import constructor3.hello.CC;	// kono akta package er class k use korte chaile. 
public class Constructor3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	//	CC cc = new CC();
		CC.rrr(2,3,4);  // look at
		Student3 red = new Student3();  // ctrl key chepe Student a click koro
		red.setNumber(5.5);			// taile student constructur a chole jabe
		red.setId("171-15-8557");
		
		Student3 wan = new Student3();
		
		wan.setName(scan.nextLine());
		wan.setNo(5);
		
		Student3 pad = new Student3(); 
		
		Student3 ami = new Student3(3.25, "171-15-7977", "Email", 5 );
		
		System.out.println(red.getNumber() + "\t" + red.getId());
		System.out.println(wan.getName() + "\t" + wan.getNo());
		
		System.out.println(pad.mul());
		
		ami.prnt();
		scan.close();
	}


}
