// Day 26 coding Statement : Write a program to calculate Maximum number of handshakes
// Description
// Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.
// For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.
// So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0
// Input
// 10
// Output
// 45

import java.util.*;

class day26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the number: ");
            int N = sc.nextInt();
            System.out.println("Maximum Number of handshake possible are: " + numberOfShakeHands(N));
        } // End for

        sc.close();
    }// End main

    public static int numberOfShakeHands(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + N - i;
        } // End for
        return sum;
    }// End numberOfShakeHands
}// End class