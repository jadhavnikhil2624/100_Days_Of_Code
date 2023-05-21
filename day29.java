// Day 29 coding Statement : Write a Program to concatenate a string.
// Description
// Get two strings as input from the user and then concatenate it.
// Input
// Enter first string
// Hello
// Enter second string
// Hi
// Output
// HelloHi

import java.util.*;

class day29 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the first String: ");
            String s1 = sc.nextLine();
            System.out.print("Enter the second String: ");
            String s2 = sc.nextLine();

            System.out.println("Concatenated String are: " + s1 + s2);
        } // End for

        sc.close();
    }// End main
}// End class