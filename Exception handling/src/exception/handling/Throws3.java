package exception.handling;

public class Throws3 {
    public static void main(String[] args) {
        int a = 6;
        if(a != 0){
//            throw new RuntimeException();
             throw new myClass();
        }
    }
}

class myClass extends RuntimeException {

}