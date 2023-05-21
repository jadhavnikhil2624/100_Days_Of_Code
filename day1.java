import java.util.*;

class day_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        Characters(s);
        sc.close();
    }// End main

    public static void Characters(String s) {
        if (s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonent");
        } // End if-else
    }// End Character
}// End class