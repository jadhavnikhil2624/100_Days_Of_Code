// Day 15 coding Statement : Write a program to identify if the number is Strong number or not
// Description
// Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
// E.g. let the number be 145
// Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

import java.util.*;

class day15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int result = n;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + factorial(digit);
                n = n / 10;
            } // End while

            if (result == sum) {
                System.out.println(result + " is Strong number");
            } else {
                System.out.println(result + " is not Strong number");
            } // End if-else
        } // End for

        sc.close();
    }// End main

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        } // End for
        return fact;
    }// End factorial
}// End class