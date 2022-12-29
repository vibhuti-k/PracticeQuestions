//Write a program to calculate simple interest.

import java.util.Scanner;

public class PQ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle : ");
        float p = sc.nextFloat();
        System.out.print("Enter the value of rate : ");
        float r = sc.nextFloat();
        System.out.print("Enter the value of time : ");
        float t = sc.nextFloat();
        float si = p*r*t;
        System.out.print("The simple interest is this : "+si);
    }
}
