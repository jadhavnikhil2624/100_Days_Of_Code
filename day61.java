<<<<<<< HEAD
import java.util.*;

class day61 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of testcases: ");
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      System.out.println("Enter value of a: ");
      int a = sc.nextInt();

      System.out.println("Enter value of b: ");
      int b = sc.nextInt();

      int sum = a + b;

      if (sum < 3) {
        System.out.println(1);
      } else if (sum >= 3 && sum <= 10) {
        System.out.println(2);
      } else if (sum >= 11 && sum <= 60) {
        System.out.println(3);
      } else if (sum > 60) {
        System.out.println(4);
      }
    }
  } //End main
} //End class
=======
import java.util.*;

class day61 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of testcases: ");
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      System.out.println("Enter value of a: ");
      int a = sc.nextInt();

      System.out.println("Enter value of b: ");
      int b = sc.nextInt();

      int sum = a + b;

      if (sum < 3) {
        System.out.println(1);
      } else if (sum >= 3 && sum <= 10) {
        System.out.println(2);
      } else if (sum >= 11 && sum <= 60) {
        System.out.println(3);
      } else if (sum > 60) {
        System.out.println(4);
      }
    }
  } //End main
} //End class
>>>>>>> 437f4771472f1360c782bd6d89a93d0c47479381
