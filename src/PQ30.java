//Compute the area of triangle

import java.util.Scanner;

public class PQ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle.");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float s = (a+b+c)/2;
        float w = 1f/2f;
        float area = (float) Math.pow((s*(s-a)*(s-b)*(s-c)),w);
        System.out.println("The area of the triangle is this : "+area);
    }
}
