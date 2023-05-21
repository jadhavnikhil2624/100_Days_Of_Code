import java.util.*;

public class day4 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int num = sc.nextInt();

            if (num>=0) {
                System.out.println(num + " is Positive");
            } else {
                System.out.println(num + " is Negative");
            } // End if-else
        } // End for
    }//End main
}//End class