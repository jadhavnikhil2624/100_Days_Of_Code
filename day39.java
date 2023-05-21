// Day 39 coding Statement : Write a Program to check if two strings are Anagram or not
// Description
// Get two strings as input from the user and check whether it is Anagram or not.
// Input
// sunlight thgiluns
// Output
// Anagram

import java.util.*;

class day39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String1: ");
            String str1 = sc.nextLine();

            System.out.print("Enter the String2: ");
            String str2 = sc.nextLine();

            char[] arr = str1.toCharArray();
            Arrays.sort(arr);

            char[] arr1 = str2.toCharArray();

            if (Arrays.equals(arr, arr1)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            } // End if-else
        }//End for 
        sc.close();
    }// End main
}// End class