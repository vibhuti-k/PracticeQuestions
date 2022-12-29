//Write a program to calculate area and parameter of rectangle.

import java.util.Scanner;

public class PQ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int l = sc.nextInt();
        System.out.print("Enter breath : ");
        int b = sc.nextInt();
        int area = l*b;
        int parameter = 2*(l+b);
        System.out.println("The area of the rectangle is this : "+area);
        System.out.println("The parameter of the rectangle is this : "+parameter);
    }
}
