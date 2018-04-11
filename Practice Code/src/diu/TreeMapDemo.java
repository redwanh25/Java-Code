package diu;

import java.util.*;

public class TreeMapDemo {
   public static void main(String[] args) {
      
      // creating tree map 
      TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

      // populating tree map
      treemap.put(2, "two");
      treemap.put(1, "one");
      treemap.put(3, "three");
      treemap.put(6, "six");
      treemap.put(5, "five");

      // putting values in navigable set
      Set nset = treemap.descendingKeySet();
      Integer[] a = (Integer[]) nset.toArray(new Integer[nset.size()]);

      System.out.println("Checking value");
      System.out.println("Navigable set values: "+ nset);
      for(int i : a) {
    	  System.out.println(i + " " );
      }
   }    
}
