// Day 54 coding Statement : Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.
// Sample input 1:
// 4
// 2 -4 -1 -3
// 3
// 1 3 5
// Sample output 1:
// Disjoint
// Sample input 2:
// 5
// 1 5 -7 6 3
// 4
// 2 4 6 8
// Sample output 2:
// Not disjoint. ( 6 is common)

import java.util.*;

class day54 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of test cases: ");
    int test = sc.nextInt();

    for (int j = 0; j < test; j++) {
      System.out.print("\nEnter the size of first array: ");
      int m = sc.nextInt();

      int arr1[] = new int[m];
      System.out.print("\nEnter the array elements: ");
      for (int i = 0; i < m; i++) {
        arr1[i] = sc.nextInt();
      } //End for

      System.out.print("\nEnter the size of second array: ");
      int n = sc.nextInt();
      int arr2[] = new int[n];
      System.out.print("\nEnter the array elements: ");
      for (int i = 0; i < n; i++) {
        arr2[i] = sc.nextInt();
      } //End for

      if (isDisjoint(m, arr1, n, arr2) == true) {
        System.out.println("Arrays are Disjoints.");
      } else {
        System.out.println("Arrays are not Disjoints.");
      } //End if-else
    }
    sc.close();
  } //End main

  public static boolean isDisjoint(int m, int arr1[], int n, int arr2[]) {
    int i = 0;

    while (i < m) {
      for (int j = 0; j < n; j++) {
        if (arr1[i] == arr2[j]) {
          return false;
        } //End if
      } //End for
      i++;
    } //End while
    return true;
  } //End isDisjoint
} //End class
