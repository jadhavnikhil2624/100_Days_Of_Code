// Day 40 coding Statement : Write a Program to Replace substring in a string
// Description
// Get a string as input from the user and then get another string which has to be removed from the string.
// Get the third input, the new substring which is placed in that substring position.
// Finally print the output by replacing the substring with new string.
// Input
// Enter a string
// talentbattle
// Enter the substring to be removed :
// talent
// Enter the new substring :
// student
// Output
// The new string :
// studentbattle

import java.util.*;

class day40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println();
            System.out.print("Enter the String1: ");
            String s1 = sc.next();
            System.out.print("Enter the String2:");
            String s2 = sc.next();

            System.out.print("Enter the String3:");
            String s3 = sc.next();

            replaceString(s1, s2, s3);
        }
        sc.close();
    }// End main

    public static void replaceString(String str1, String str2, String str3) {
        String s = str1.replace(str2, "");
        StringBuilder sb = new StringBuilder();
        sb.append(str3 + s);
        
        System.out.println("The new String: "+sb.toString());
    }// End replaceString
}// End class