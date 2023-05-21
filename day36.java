// Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string
// Description
// Get a string from the user and then change the first and last letter to uppercase.
// Input
// programming
// Output
// ProgramminG

import java.util.*;

class day36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.nextLine();
            CapitalizeLetter(s);
            System.out.println();
        }
        sc.close();
    }// End main

    public static void CapitalizeLetter(String s) {
        int length = s.length();
        String letter1 = s.substring(0, 1);
        String lastLetter = s.substring((length - 1), length);
        String newWord = letter1.toUpperCase() + s.substring(1, length - 1) + lastLetter.toUpperCase();

        System.out.println("The word with first letter capitalized is: " + newWord);
    }
}// End class