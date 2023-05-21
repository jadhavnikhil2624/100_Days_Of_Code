
// Day 30 coding Statement : Write a Program to print Length of the string without using strlen() function
// Description
// Get a string as input from user and print the length of the string without using strlen() function.
// Input
// Hello
// Output
// 5
import java.util.*;

class day30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.next();
            int count = 0;
            for (char c : s.toCharArray()) {
                count++;
            } // End for

            System.out.println("The length of the string is: " + count);
        } // End for

        sc.close();
    }// End main

}// End class