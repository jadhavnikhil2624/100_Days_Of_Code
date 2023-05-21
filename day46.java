import java.util.*;

class day46 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 3; j++) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            System.out.print("Enter the array Elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            } // End for i
            System.out.println("The sum of an array is: " + sum);
        } // End for i
        sc.close();
    }// End main
}// End class