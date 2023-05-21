
// Day 35 coding Statement : Write a Program to Count the sum of numbers in a string
// Description
// Get a string from the user and find the sum of numbers in the string.
// Input
// Hello56
// Output
// 11
import java.util.*;

class day35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.next();

            System.out.println("Sum is: " + sumOfString(s));
        } // End for
        sc.close();
    }// End main

    public static int sumOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }
}// End class