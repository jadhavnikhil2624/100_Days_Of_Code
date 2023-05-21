
// Get a number from user and then find the sum of the digits in the given number.
import java.util.*;

class day12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit;
                n = n / 10;
            }//End while 
            System.out.println("The Sum of the digits of a number: " + sum);
        } // End for

        sc.close();
    }// End main
}// End class