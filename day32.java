// Day 32 coding Statement : Write a Program to Remove vowels from a string
// Description
// Get a string as the input from the user and then remove all the vowel letters from the string and give the output.
// Input
// remove
// Output
// rmv

import java.util.*;

class day32 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the String: ");
            String s = sc.nextLine();
            // Without Using Loop
            System.out.println("Without Using Loop: " + removeVowels(s));
            // Using Loop
            System.out.println("Using Loop: " + removeVowelss(s));
        } // End for
        sc.close();
    }// End main

    public static String removeVowels(String s) {
        if (s == null) {
            return null;
        } // End if

        return s.replaceAll("[aAeEiIoOuU]", "");
    }// End removeVowels

    public static String removeVowelss(String s) {
        if (s == null) {
            return null;
        } // End if

        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = new HashSet<Character>();

        vowels.add('a');
        vowels.add('A');

        vowels.add('e');
        vowels.add('E');

        vowels.add('i');
        vowels.add('I');

        vowels.add('o');
        vowels.add('O');

        vowels.add('u');
        vowels.add('U');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!vowels.contains(c)) {
                sb.append(c);
            } // End if
        } // End for
        return sb.toString();
    }// End removeVowels
}// End class