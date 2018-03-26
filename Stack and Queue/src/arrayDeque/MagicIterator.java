package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MagicIterator {
   public static void main(String[] args) {
      
      // create an empty array deque with an initial capacity
      Deque<Integer> deque = new ArrayDeque<Integer>(8);

      // use add() method to add elements in the deque
      deque.add(15);
      deque.add(22);
      deque.add(25);
      deque.add(20);

      //iterator() is used to print all the elements
      //next() returns the next element on each iteration
      System.out.println("printing elements using iterator:");
       
      for(Iterator<Integer> itr = deque.iterator(); itr.hasNext(); )  {
         System.out.println(itr.next());
      }

      //descendingIterator() is used to print the elements in reverse order
      //next() returns the next element on each iteration
      System.out.println("printing elements in reverse order:");
       
      for(Iterator descItr = deque.descendingIterator(); descItr.hasNext(); ) {
         System.out.println(descItr.next());
      }
   }
 }  
