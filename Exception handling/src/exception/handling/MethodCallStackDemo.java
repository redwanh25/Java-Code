package exception.handling;

// please read 230 page (A N M bojlur rahman)

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("inside the main method");
        method_A();
        System.out.println("Exiting method main");
    }
    public static void method_A() {
        System.out.println("inside the method A");
        method_B();
        System.out.println("Exiting method A");
    }
    public static void method_B() {
        System.out.println("inside the method B");
        try{
            method_C();
        } catch(Throwable e){
            System.out.println(e);
        }
        System.out.println("Exiting method B");
    }
    public static void method_C() {
        System.out.println("inside the method C");
        method_D();
        System.out.println("Exiting method C");
    }
    public static void method_D() {
        System.out.println("inside the method D");
//        try{
//            int a = 5/0;
//        } catch(Throwable e){
//            System.out.println(e);
//        }
        int a = 5/0;
        System.out.println("Exiting method D");
    }
}
