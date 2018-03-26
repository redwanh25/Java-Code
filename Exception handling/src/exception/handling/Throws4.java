package exception.handling;

public class Throws4 {
    public static void main(String[] args) {    // aikhane "throws Exception" likhle "try" "catch" block r use korte hobe na.
        A obj = new A();
        try{
            obj.print();    // it will throw Exception so, we have to use "try" "catch" block
        } catch(Exception e){
            e.printStackTrace();
        }
        obj.print1();       // it is a RuntimeException so, we don't need to use "try" "catch" block
    }
}

class A {
    public void print() throws Exception {
        System.out.println("redwan");
    }
    public void print1() throws RuntimeException {
    	System.out.println("hossain");
    }
}
