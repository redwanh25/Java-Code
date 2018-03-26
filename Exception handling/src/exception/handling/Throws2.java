package exception.handling;

import java.io.IOException;

public class Throws2 {
    public static void main(String[] args) {
        int a = 6, b =  2;
        try {
            if(a % b == 0){
//                Exception e = new Exception();
//                Exception e = new IOException();
//                IOException e = new IOException();
//                throw e;
//                throw new Exception();    
                throw new IOException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
