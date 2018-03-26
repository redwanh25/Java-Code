package practice;

import java.util.Scanner;
public class String2d {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    int columns = 2;
	 //   int rows = 2;

	    String[] newArray = new String[columns];
	    newArray[0] = "France";
	    newArray[1] = "Blue";

	//    newArray[1][0] = "Ireland";
	//    newArray[1][1] = "Green";

	 //   for(int i = 0; i < rows; i++){
	        for(int j = 0; j < columns; j++){
	            System.out.print(newArray[j] + " ");
	        }
	        System.out.println();
	//    }
	    scan.close();
	}
}

/*

    int columns = 2;
    int rows = 2;

    String[][] newArray = new String[columns][rows];
    newArray[0][0] = "France";
    newArray[0][1] = "Blue";

    newArray[1][0] = "Ireland";
    newArray[1][1] = "Green";

    for(int i = 0; i < rows; i++){
        for(int j = 0; j < columns; j++){
            System.out.println(newArray[i][j]);
        }
    }

*/
