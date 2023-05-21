// Day 31 coding Statement : Write a Program to Toggle each character in a string
// Description
// Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.
// Input
// Hello
// Output
// hELLO

import java.util.*;

class day31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.nextLine();

            changeCase(s);
        } // End for

        sc.close();
    }// End main

    public static void changeCase(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isLowerCase(s.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } // End if-else
        } // End for
        System.out.println("String after case conversion : " + sb.toString());
    }// End changeCase
}// End class