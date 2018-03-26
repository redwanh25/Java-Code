package superkeyword;

public class Car extends Vehicle
{
	public int km = 10;
	
	Car(int a){
		super(3, a, "redwan");	// a = 2 from MainMain
	}							// a = 6 from Track
    public int value(int v) {
    	km = v;
    	return km;
    }
    @Override
    public int cal() {
    	km = 3;
    	return (km * super.cal());  	//  10 * (3*2)
    }
    public int cal_1() {
    	return (cal() * cal());	// ai class er "cal()" call hobe
    }
    public int cal_2() {
    	System.out.println(km);		// 3
    	return (super.cal() * super.cal());	// super class er "cal()" call hobe
    }
}

// be careful, static method er vitore "super" keyword use kora jay na.  