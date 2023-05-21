// Day 33 coding Statement : Write a Program to check if String is a palindrome or not
// Description
// Get an input string from the user and then check whether it is a palindrome string or not.
// Input
// noon
// Output
// Palindrome
// Input
// Talent
// Output
// Not a Palindrome

import java.util.*;

class day33 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.nextLine();

            if (isPalindrome(s)) {
                System.out.println(s + " is Palindrome String");
            } else {
                System.out.println(s + " is not Palindrome String");
            } // End if-else
        } // End for

        sc.close();
    }// End main

    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }// End isPalindrome
}// End class