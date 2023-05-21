
// Day 42 coding Statement : Write Program to check if two arrays are the same or not
import java.util.*;

class day42 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the size of first array: ");
            int size1 = sc.nextInt();
            System.out.print("Enter the size of second array: ");
            int size2 = sc.nextInt();

            int arr1[] = new int[size1];
            int arr2[] = new int[size2];

            System.out.print("Enter the first array elements: ");
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
            System.out.print("Enter the second array elements: ");
            for (int k = 0; k < arr2.length; k++) {
                arr2[i] = sc.nextInt();
            }

            if (isMatch(arr1, arr2)) {
                System.out.println("Both arrays are same");
            } else {
                System.out.println("Both arrays are not same");
            } // End if-else
        }

        sc.close();
    }// End main

    public static boolean isMatch(int arr1[], int arr2[]) {
        boolean equal = Arrays.equals(arr1, arr2);
        return equal;
    }
}// End class