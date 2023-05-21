// Get an input from the user and the print the reverse of the given number as the output

import java.util.*;

class day14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter the number: ");
            int n = sc.nextInt();

            System.out.print("The reverse number is: ");
            while (n > 0) {
                int digit = n % 10;
                System.out.print(digit);
                n = n / 10;
            } // End while
        } // End for

        sc.close();
    }// End main
}// End class