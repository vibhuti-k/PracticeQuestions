//Write a program to find circumference of a circle.

import java.util.Scanner;

public class PQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        System.out.println("The circumference is : "+(2*3.14*r));
    }
}
