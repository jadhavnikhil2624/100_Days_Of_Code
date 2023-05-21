// Write a program to find roots of a quadratic equation

import java.util.*;

class day8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the  value of a: ");
            int a = sc.nextInt();

            System.out.println("Enter the  value of b: ");
            int b = sc.nextInt();

            System.out.println("Enter the  value of c: ");
            int c = sc.nextInt();

            int discriminant = b * b - 4 * a * c;

            double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

            if (x1 == x2) {
                System.out.println("Roots are Equal\nRoot1 == Root2 == "+x1);
            } else {
            System.out.println("Roots are not Equal\nRoot1 == Root2 == "+x2);
            } // End if-else

        } // End for
        sc.close();
    }// End main
}// End class