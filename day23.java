// Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer
// Description
// Get a number as input from the user and find the zeros present in that number.
// Then convert the zeros into one and then print it.

// Input
// 310020
// Output
// 311121

import java.util.*;

class day23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            System.out.println(replaceZero(n));
        }//End for 

        sc.close();
    }// End main

    public static int reverseNum(int temp) {
        int ans = 0;

        while (temp > 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        return ans;
    }// End reverseNum

    public static int replaceZero(int num) {

        if (num == 0) {
            return 1;
        } else {

            int temp = 0;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 0) {
                    digit = 1;
                } // End if
                temp = temp * 10 + digit;
                num = num / 10;
            } // End while
            return reverseNum(temp);
        } // End if-else
    }// End replaceZero
}// End class