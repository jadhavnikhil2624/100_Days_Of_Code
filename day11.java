
// Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.
import java.util.*;

class day11 {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacii Series are: ");
        System.out.print(n1 + " " + n2);

        for (int j = 0; j < n; j++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        } // End for

        sc.close();
    }// End main
}// End class