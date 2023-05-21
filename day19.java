
// Write a program to identify if the number is Armstrong number or not
import java.util.*;

class day19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (isArmstrong(n) == true) {
                System.out.println(n + " is an Armstrong  number");
            } else {
                System.out.println(n + " is not an Armstrong number");
            } // end if-else
        }//End for 
        sc.close();
    }// End main

    public static boolean isArmstrong(int n) {
        int temp = n, digits = 0, sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        } // end while
        temp=n;
        while (temp > 0) {
            int num = temp % 10;
            sum += (Math.pow(num, digits));
            temp /= 10;
        } // End while

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }// End isArmstrong
}// End class