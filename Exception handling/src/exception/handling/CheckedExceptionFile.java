package exception.handling;

import java.io.File;            // for "File f = new File("text.txt");" this line
import java.io.FileNotFoundException;
import java.io.IOException;     // IOException er jonno ai package ta import korte hobe.
import java.io.PrintWriter;     // for "PrintWriter p = new PrintWriter(f);" this line
import java.util.Scanner;

public class CheckedExceptionFile {
    public static void main(String[] args) {
   //     File f = new File("C:\\Users\\redwa\\OneDrive\\Documents\\NetBeansProjects\\Exception handling\\text.txt");
   // jodi project file er moddhe text file ta na thake taile amader k ai vabe location (path) bole dite hobe.
   
        File f = new File("text.txt");
        try{
//            if(! f.exists()){
//                f.createNewFile();          // ai vabe file create na kore just nicher line ta likhle e file create hoye jay.
//            }
            PrintWriter p = new PrintWriter(f);     // ai line ta jokhon likha hoy tokhon e akta file tiri hoye jay.
    //        p.println("Redwan hossain");
            p.print("Ramij hossain");
            p.println(12);
            p.println(14);
            p.close();        // be careful. p.close() na dile file a output show korbe na.
        }
        catch(IOException e){       // IOException er jonno ai package ta import korte hobe.
                                    // jokhon file a write kora hoy tokhon input-output operation failed or interruped  hote pare.
                                    // ai jonno IOException hobe...
            System.out.printf("Error : %s", e);
        }
        catch(Exception e){
            System.out.println(e);
        } 
        Scanner cin;
   //   String str = new String();    and      String str = null;     same
        String str = null;
        try{
            cin = new Scanner(f);
            str = cin.nextLine();
            int a = cin.nextInt();
            System.out.println(str + " * " + a);
        }
        catch(FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(str);
    }
}
