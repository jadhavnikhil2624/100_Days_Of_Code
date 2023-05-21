// Get a number as input from the user and check whether that number is a Palindrome or not.

import java.util.*;

class day21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (isPalindrome(n) == true) {
                System.out.println(n + " is Palindrome number");
            } else {
                System.out.println(n + " is not Palindrome number ");
            }
        }

        sc.close();
    }// End main

    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        } // End while

        if (original == reversed) {
            return true;
        }
        return false;
    }// End isPalindrome
}// End class