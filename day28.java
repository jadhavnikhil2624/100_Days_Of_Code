import java.util.*;

class day28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter the String: ");
            String s = sc.next();

            reverseString(s);

            System.out.println("\nUsing StringBuilder");
            useStringBuilder(s);
        } // End for

        sc.close();
    }// End main

    public static void reverseString(String s) {
        int low = 0;
        int high = s.length() - 1;

        for (int i = high; i >= low; i--) {
            System.out.print(s.charAt(i));
        } // End for
    }// End reverseString

    public static void useStringBuilder(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s);

        System.out.println(sb.reverse());
    }// End useStringBuilder
}// End class