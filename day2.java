// DAY-2 TALENT BATTLE CODING 100 DAYS OF CODING CHALLANGE.
import java.util.Scanner;

public class day_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);// To take character as an input in java

        isAlphabet(ch);
        sc.close();
    }// End main

    public static void isAlphabet(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is not an Alphabet");
        } // End if-else
    }// End isAlphabet
}// End class
