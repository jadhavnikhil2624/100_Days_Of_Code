// Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;
// Sample input 1:
// 4
// 2 4 1 3
// Sample output 1:
// 3 1 4 2
// Sample input 2:
// 5
// 1 5 7 5 3
// Sample output 2
// 3 5 7 5 1

import java.util.*;

class day52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of test cases: ");
        int test = sc.nextInt();

        for (int j = 0; j < test; j++) {
            System.out.print("\nEnter the size of the array: ");
            int N = sc.nextInt();

            int arr[] = new int[N];
            System.out.print("\nEnter the array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            } // End for

            reverseArray(N, arr);// Call the functions
        }//End for 
        sc.close();
    }// End main

    public static void reverseArray(int N, int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        } // end for
    }// End reverseArray
}// End class