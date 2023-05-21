import java.util.*;

class day9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                count++;
                n = n / 10;
            } // End while
            System.out.println("The number of digits in an numbers are: " + count);
        }//End for 
        sc.close();
    }// End main
}// End class