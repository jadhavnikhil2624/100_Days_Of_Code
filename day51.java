import java.util.*;

class day51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
            System.out.print("\nEnter the size of an array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            } // End for

            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }//End for j

        sc.close();
    }// End main
}// End class