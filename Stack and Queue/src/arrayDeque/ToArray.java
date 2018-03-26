package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ToArray {
   public static void main(String[] args) {

      // create an empty array deque with an initial capacity
      Deque<Integer> deque = new ArrayDeque<Integer>(8);

      // use add() method to add elements in the deque
      deque.add(15);
      deque.add(20);
      deque.add(25);
      deque.add(18);

      // let us print all the elements available in deque
      for (Integer number : deque) {
         System.out.println("Number = " + number);
      } 

      // printing the array length of elements added above
      Object[] ob = deque.toArray();
      Integer[] a = new Integer[deque.size()];	// int dile hobe na.
      deque.toArray(a);
      
    //  Integer[] a = deque.toArray(new Integer[deque.size()]);    // same as uporer dui ta line
      
      System.out.println("\n Array Size : " + ob.length);
      System.out.println("\n Array Size : " + a.length);
      for (int number : a) {
          System.out.println("Number = " + number);
       } 
   }
}  
