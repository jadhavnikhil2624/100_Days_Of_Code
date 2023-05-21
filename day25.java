// Day 25 coding Statement : Write a program to find Area of a circle
// Description
// Get the value for radius from the user and calculate the area of the circle for the given radius.
// Area of circle = 3.14*radius*radius
// Input
// 3
// Output
// 28.26

import java.util.*;

class day25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();

            System.out.printf("Radius of circle is: %.2f\n" , areaOfCircle(radius));
        } // End for

        sc.close();
    }// End main

    public static double areaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }// End areaOfCircle
}// End class