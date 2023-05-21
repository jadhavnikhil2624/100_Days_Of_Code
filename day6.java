import java.util.*;

class day6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int a []={};
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the value of a & b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a >= 0 && b >= 0) {
                System.out.println("This point lies in first quadrant.");
            } else if (a < 0 && b >= 0) {
                System.out.println("This point lies in second quadrant.");
            } else if (a >= 0 && b < 0) {
                System.out.println("This point lies in third quadrant.");
            } else if (a < 0 && b < 0) {
                System.out.println("This point lies in fourth quadrant.");
            } // End if-else
        } // End for
        sc.close();
    }// End main
}// End class