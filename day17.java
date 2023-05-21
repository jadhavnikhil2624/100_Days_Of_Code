// Get an input from the user and find the factors of the number.
// Input
// 4
// Output
// 1,2,4  
import java.util.*;

class day17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the n: ");
            int n = sc.nextInt();

            findFactors(n);
        } // End for

        sc.close();
    }// End main

    public static void findFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            } // End if
        } // End for
        System.out.println();
    }// End findFactor
}// End class