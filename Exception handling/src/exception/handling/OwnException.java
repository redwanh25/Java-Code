package exception.handling;

public class OwnException {
    public static void main(String[] args) {
        int a = 6, b = 2;
        try {
            if (a % b == 0){
    //            throw new Exception();
    //            throw new Exception("Redwan");
    //            throw new myException();
                throw new myException("Redwan");    // aikhane parameter dite hole myException class a akta constructor toiri korte hobe
                                                    // and constructor theke "super" diye parent class er constructor a call korte hobe.  
            }
        }
        catch (myException e) {
            System.out.println(e);
            e.printStackTrace();    // er mane hosse amk details bole dibe
        }
        catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

class myException extends Exception {
    public myException() {
     //    System.out.println("redwan");
    }
    public myException(String str){
        super(str);
    }
}
