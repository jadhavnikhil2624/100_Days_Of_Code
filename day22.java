// Day 22 coding Statement : Write a program to express a number as a sum of two prime numbers
// Description
// Get a number as input from the user and express that number as sum of two prime numbers.
// Input
// 4
// Output
// 4 can be expressed as sum of 2 and 2

import java.util.*;

class day22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            sumTwoPrimeNumber(n);
        } // End for

        sc.close();
    }// End main

    public static void sumTwoPrimeNumber(int n) {
        boolean flag = false;

        for (int i = 2; i <= n / 2; ++i) {
            if (checkPrime(i)) {
                if (checkPrime(n - 1)) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    flag = true;
                } // End if
            } // End if
        } // End for

        if (!flag) {
            System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
        } // End if
    }// End sumTwoPrimeNumber

    public static boolean checkPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = false;
                break;
            } // End if
        } // End for
        return isPrime;
    }// End checkPrime
}// End class