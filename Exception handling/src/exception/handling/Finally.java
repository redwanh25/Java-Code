package exception.handling;

public class Finally {
    private int a, b;
    
    public Finally(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @SuppressWarnings("finally")
	public int temp() {
        int res = 0;
        try{
            res = a/b;
            return res;             // ai khane return paile o finally block ta execute hobe.
//            System.exit(1);       // ak matro System.exit(1) or System.exit(0) dile e program oi khane e stop hoye jabe,
//            System.exit(0);       // finally block a jabe na.
        }   // System.exit(0) mane safely code ta terminate korse. System.exit(1) mane safely na.
        catch(Exception e){
            System.out.println(e);
            return res;
        }
        finally{
            System.out.println("Redwan");
//            return res;
            return 100;         // ai block er return tai hosse final ami ja return korbo tai hobe, try or catch block e ki return korlam kono fact na.
        }
// (try + catch + finally) aita akta package er moto. i mean ai package mane code er package na. ai package mane "finally" likhte hole akta "try" block thakte hobe,
// r akta "try" block thakle akta "catch" block thakbe e. bpr ta emon e... tobe akta "try" block er shathe "catch" block na likhe akta "finally" block likha jay,
// tobe er jonno "try" block a kono checked Exception throw kora jabe na.
    }
    public static void main(String[] args) {
       int a = 10, b = 2;
 //     int a = 5, b = 0;
        Finally f = new Finally(a, b);
        System.out.println(f.temp());
        
    }
}
