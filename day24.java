
//100 DAYS OF CODING CHALLANGE BY TALENT BATTLE - DAY 24 
// PRINT PYRAMID TAKING USER INPUT 
import java.util.*;

class day24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            printPyramid(n);
        }//End for 

        sc.close();

    }// End main

    public static void printPyramid(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        } // End for
    }// End printPyramid
}// End class