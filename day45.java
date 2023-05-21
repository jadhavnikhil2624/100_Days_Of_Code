import java.util.*;

class day45 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the size of the array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0, min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                max = arr[i + 1];
            } else if (arr[i]<arr[i+1]) {
                min = arr[i];
            } // End if-else
        } // end for

        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }// End main
}// End class