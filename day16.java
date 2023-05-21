// Get the input from the user and check whether that number is a perfect number or not.

// E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
import java.util.*;

class day16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the n: ");
            int n=sc.nextInt();

            findFactor(n);
        }//End for 

        sc.close();
    }// End main

    public static void findFactor(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
            // sum = sum+i;
            System.out.println(i);
            }//End if
        }//End for

        if(n==sum){
            System.out.println(n+" is Perfect number");
        }else{
            System.out.println(n+" is not Perfect number");
        }//End if-else
    }//End findFactor
}// End class