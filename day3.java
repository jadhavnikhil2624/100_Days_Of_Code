import java.util.*;

public class day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the character: ");
            char ch = sc.next().charAt(0);

            int AsciiValue = ch;
            System.out.println("Ascii Value of a Character is: " + AsciiValue);
        } // End for
        sc.close();
    }// End main
}//End class
