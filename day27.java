
// Day 27 coding Statement : Write a program to find the double of the given number without using arithmetic operator
// Description
// For the given input number calculate the double of it without using arithmetic operator.
// Input
// 4
// Output
// 8
import java.util.*;

class day27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            System.out.println(getDouble(n));
        } // End for
        sc.close();
    }// End main

    public static int getDouble(int n) {
        int result = n << 1;
        return result;
    }// End getDouble
}// End class