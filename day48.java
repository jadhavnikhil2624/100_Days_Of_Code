import java.util.*;

class day48 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 2; j++) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            HashSet<Integer> set = new HashSet<Integer>();

            System.out.println("Enter the array Element: ");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            } // End for

            System.out.println(set);
        } // End for

        sc.close();
    }// End main
}// End class