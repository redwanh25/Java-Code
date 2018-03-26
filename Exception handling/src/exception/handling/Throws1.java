package exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // "throws FileNotFoundException, IOException" ai dui ta Exception throw na kore jodi "throws Exception" likha hoto 
        // taile e kaj hoye jeto dui ta likar kono dorkar silo na...
        // "FileNotFoundException" for "BufferedReader b = new BufferedReader(new FileReader("text.txt"));"
        // "IOException" for "b.readLine();"
        BufferedReader b = new BufferedReader(new FileReader("text.txt"));
        String str = b.readLine();
        System.out.println(str);
        
        // jodi try catch block use na korte chai and ami jodi over sure thaki j amr code exception throw korbe na taile
        // amader jeta korte hobe ta hosse method er pore "throws" keyword likhe exception er nam ta likhte hobe.
    }
}
