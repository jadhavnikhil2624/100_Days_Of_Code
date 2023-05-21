// Get the input from the user for the value of n and then find the sum of first n natural numbers.

import java.util.*;

class day13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            for (int j = 1; j <= n; j++) {
                sum = sum + j;
            } // End for

            System.out.println("Sum of first " + n + " numbers is: " + sum);
        } // End for
        sc.close();
    }// End main
}// End class