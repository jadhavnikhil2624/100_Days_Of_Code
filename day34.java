// Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression
// Description
// Get an algebraic expression as input from the user and then remove all the brackets in that.
// Input
// 7x+(2*y)
// Output
// 7x+2*y

import java.util.*;

class day34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.nextLine();
            System.out.println(removeParenthesis(s));
        }
        sc.close();
    }// End main

    public static String removeParenthesis(final String s) {
        String replaced = s.replaceAll("[()]", "");
        return replaced;
    }// End removeParenthesis
}// End class