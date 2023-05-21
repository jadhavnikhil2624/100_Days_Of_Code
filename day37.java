// Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string
// Description
// Get a string as the input from the user and find the frequency of characters in the string.
// Input
// program
// Output
// The frequency of a is 1
// The frequency of g is 1
// The frequency of m is 1
// The frequency of o is 
// The frequency of p is 1
// The frequency of r is 2

import java.util.*;

class day37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");

            String s = sc.nextLine();

            frequencyStrings(s);
            System.out.println();
        }

        sc.close();
    }// End main

    public static void frequencyStrings(String str) {
        char strnew[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (j < i && strnew[i] == strnew[j])
                    break;

                if (strnew[i] == strnew[j]) {
                    counter++;
                } // End if

                if (j == str.length() - 1) {
                    System.out.println("The Character " + strnew[i] + " is present " + counter + " times");
                }
            } // End if

        } // End for

    }// End frequencyStrings
}// End class