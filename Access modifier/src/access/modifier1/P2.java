package access.modifier1;

import java.util.Random;

public class P2 {
   public static void main( String args[] ) {

      // create random object
      Random rand = new Random();
    
      // check next int value
      int min = 10;
      int max = 20;
      
      System.out.println("Next int value: " + (min + rand.nextInt(max - min + 1) ) );
   }    
}
