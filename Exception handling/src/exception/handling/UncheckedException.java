package exception.handling;

public class UncheckedException {
        public static void main(String[] args) {
        int a = 5, b = 0, res = 0;
        System.out.println("ramij");
        double[] arr = new double[10]; 
        try{
            res = a/b;      // aita akta Arithmetic Exception
        }
        catch(ArrayIndexOutOfBoundsException ex){   // ArrayIndexOutofBoundsException er jonno kono package import korte hobe na.
            System.out.println("this is an ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e){       // ArithmeticException er jonno kono package import korte hobe na.
            System.out.println("e ---->>   " + e);
            System.out.println("e.getMessage() ---->>   " + e.getMessage());
            System.out.println("e.toString() ---->>   " + e.toString());
            e.printStackTrace();
        }
        catch(Exception e){         // Exception er jonno kono package import korte hobe na.
            System.out.println(e);
        }
        catch(Throwable e){         // Throwable hosse superclass. er duta subclass hosse Exception and Error 
            System.out.println(e);  // page-219 (bojlur rahman (java))
        }
        
        try{
            arr[14] = 4.5;
            System.out.println("dhiskiao");
        }
        catch(Exception e){
            System.out.println("e ---->>   " + e);
            System.out.println("e.getMessage() ---->>   " + e.getMessage());
            System.out.println("e.toString() ---->>   " + e.toString());
            e.printStackTrace();
        }
        System.out.println("Redwan");
    }
}
