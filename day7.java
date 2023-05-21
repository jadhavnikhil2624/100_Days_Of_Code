import java.util.*;

class day7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the Month: ");
            int Month = sc.nextInt();
            System.out.println("Enter the Year: ");
            int Year = sc.nextInt();
            Months(Month, Year);
        }//End for 

        sc.close();
    }// End main

    public static void Months(int Month, int Year) {
        if (Month == 2 && (Year % 400 == 0) || (Year % 100 != 0) && Year % 4 == 0) {
            System.out.println("Month "+Month +" contains 28 days");
        } else if (Month == 2) {
            System.out.println("Month "+Month +" contains 29 days");
        } else if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
            System.out.println("Month "+Month + " contains 31 days");
        } else {
            System.out.println("Month "+Month + " contains 30 days");
        } // End if-else
    }// End Month
}// End class