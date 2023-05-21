import java.util.*;

class day43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 3; j++) {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter the array element: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            } // End for

            int odd = 0, even = 0, mixed = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else if (arr[i] % 2 == 1) {
                    odd++;
                } else {
                    mixed++;
                }
            }

            if (odd == n) {
                System.out.println("Odd");
            } else if (even == n) {
                System.out.println("Even");
            } else {
                System.out.println("Mixed");
            }
        }
        sc.close();
    }// End main
}// End class