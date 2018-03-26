package superkeyword;

public class Track extends Car
{
	int a;
	Track(){
		super(6);
	}
	public int cal() {
		System.out.println(super.value(14));	// 14
		System.out.println(super.km);			// 14
		System.out.println(super.speed);		// 3
		return 0;					
	}
}


//public class Track extends Vehicle
//{
//	Track(){
//		super(2, 3, "redwan");
//	}
//}