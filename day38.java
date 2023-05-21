// Day 38 coding Statement : Write a Program to print Non-repeating characters in a string
// Description
// Get a string as the input from the user and print the non-repeating characters in a string.
// Input
// Hello
// Output
// H e o

import java.util.*;

class day38 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            System.out.println();
            System.out.print("Enter the String: ");
            String str = sc.nextLine();

            int frequency[] = new int[256];
            for (int i = 0; i < str.length(); i++) {
                frequency[str.charAt(i)]++;
            }
            System.out.print("Non repeating characters are: ");
            for (int i = 0; i < 256; i++)
                if (frequency[i] == 1)
                    System.out.print((char) i + " ");
            System.out.println();
        } // End for
        sc.close();
    }// End main
}// End class