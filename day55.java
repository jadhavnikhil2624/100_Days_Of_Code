// Day 55 coding Statement : Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.
// Sample input 1:
// 4
// 1 2 3 4
// 5 6 7 8
// Sample output 1:
// 70
// Explanation :
// (8*4 + 7*3 + 6*2 + 1*5) = 70
// Sample input 2:
// 4
// -1 -2 -3 -4
// 5 6 -7 -8
// Sample output 2:
// 37
// Explanation :
// (-4*-8 + -3*-7 + -2*5 + -1*6) = 37
import java.util.*;

class day55 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    for (int j = 0; j < 2; j++) {
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int arr1[] = new int[n];
      int arr2[] = new int[n];
      System.out.println("Enter the First Array elements: ");
      for (int i = 0; i < arr1.length; i++) {
        arr1[i] = sc.nextInt();
      } //End for
      System.out.println("Enter the Second Array elements: ");
      for (int i = 0; i < arr2.length; i++) {
        arr2[i] = sc.nextInt();
      } //End for

      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int product = product(arr1, arr2);
      System.out.println(product);
    } //End for

    sc.close();
  } //End main


  public static int product(int arr1[], int arr2[]) {
    int product = 0;
    for (int i = arr1.length - 1; i >= 0; i--) {
      product += arr1[i] * arr2[i];
    } //End for i
    return product;
  } //End java
} //End class