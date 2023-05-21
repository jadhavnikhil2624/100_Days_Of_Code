
// Day 20 coding Statement : Write a program to identify if the number is Prime number or not
import java.util.*;

class day20 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Enter the number: ");
                int n = sc.nextInt();

                isPrime(n);// Function calling
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } // end try-catch
        } // End for
        sc.close();

    }// End main

    public static void isPrime(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            // Conditionn for non prime
            if (n % i == 0) {
                flag = true;
                break;
            } // End if
        } // End for

        if (!flag) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        } // End if-else
    }// End isPrime
}// End class