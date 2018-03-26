package exception.handling;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFromFile {
    public static void main(String[] args) {
        
/////////////////////// one way ////////////////////////

        BufferedReader b;
        try{
            FileReader f1 = new FileReader("new text.txt");     // aita dile akta exception throw korte pare. ai jonno aita try block er moddhe likhte hobe.
                                                            // karon file nao paite pare...
            b = new BufferedReader(f1);
//          b = new BufferedReader(new FileReader("text.txt"));       // ai vabe o kora jay.
            String str;
            while((str = b.readLine()) != null){
                System.out.println(str);
            }
            
            b.close();      // aita IOException throw korte pare tai aita k try block er moddhe likhte hobe.
        }
        catch(IOException e){
            System.out.println(e);
        }
       
/////////////////////// another way ////////////////////////   
        
        File f = new File("text.txt");
        Scanner cin;
        try {
            cin = new Scanner(f);
            String str1;
            while(cin.hasNext()){
                System.out.println(str1 = cin.nextLine());
            }
            
            cin.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
