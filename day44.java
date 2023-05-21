import java.util.*;

class day44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int even = 0, odd = 0;
            int arr[] = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } // End for

            System.out.println("Number of Even Elements: " + even);
            System.out.println("Number of Odd Elements: " + odd);
        }//End for 
        sc.close();
    }// End main
}// End class