
//100 DAYS CODING CHALLANGE BY TALENT BATTLE :- DAY 5
// Get a number as input from the user and check whether the given number is odd or even
import java.util.*;

class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();

            System.out.println(n % 2 == 0 ? "Even" : "Odd");

        } // End for

        sc.close();
    }// End main
}// End class