// Day 65 coding Statement : New Tablet
// Ajinkya decided to buy a new tablet. His budget is B, so he cannot buy a tablet whose price is greater than B. Other than that, he only has one criterion — the area of the tablet's screen should be as large as possible. Of course, the screen of a tablet is always a rectangle.
// Ajinkya has visited some tablet shops and listed all of his options. In total, there are N available tablets, numbered 1 through N. For each valid i, the i-th tablet has width Wi, height Hi and price Pi.
// Help Ajinkya choose a tablet which he should buy and find the area of such a tablet's screen, or determine that he cannot buy any tablet.
// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains two space-separated integers N and B. N lines follow.
// For each i (1≤i≤N), the i-th of these lines contains three space-separated integers Wi, Hi and Pi.
// Output
// For each test case, print a single line. If Ajinkya cannot buy any tablet, it should contain the string "no tablet" (without quotes).
// Otherwise, it should contain a single integer — the maximum area of the screen of a tablet Ajinkya can buy.
// Sample Input 1
// 3
// 3 6
// 3 4 4
// 5 5 7
// 5 2 5
// 2 6
// 3 6 8
// 5 4 9
// 1 10
// 5 5 10
// Sample Output 1
// 12
// no tablet
// 25
import java.util.Scanner;

public class day65 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of testcases: ");
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      System.out.println("Enter the N: ");
      int N = sc.nextInt();

      System.out.println("Enter the budget: ");
      int B = sc.nextInt();
      int arr[] = new int[1];
      for (int j = 0; j < N; j++) {
        System.out.println("Enter the width: ");
        int W = sc.nextInt();

        System.out.println("Enter the height: ");
        int H = sc.nextInt();

        System.out.println("Enter the price: ");
        int P = sc.nextInt();

        if (B < P) {
          continue;
        } //End if

        int area = (W * H);
        for (int k = 0; k < arr.length; k++) {
          if (area > arr[k]) {
            arr[k] = area;
          } //End if
        } //End for
      } //End for j

      for (int j = 0; j < arr.length; j++) {
        if (arr[0] == 0) {
          System.out.println("No Tablet");
        } else {
          System.out.println(arr[0]);
        } //End if-else
      } //End for
    } //End for i

    sc.close();
  } //End main
} //End class
