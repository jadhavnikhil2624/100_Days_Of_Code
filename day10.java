
// Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.
import java.util.*;

class day10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            day10 d = new day10();
            System.out.println("Factorial of a " + n + " is:" + d.findFactorial(n));
        }//End for 
        sc.close();
    }// End main

    int findFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        } // End for
        return result;
    }// End findFactorial
}// End class