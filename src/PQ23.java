//Program to find sum of random natural numbers.

import java.util.Scanner;

public class PQ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers you want to add : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers.");
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += sc.nextInt();
        }
        System.out.println("The sum of numbers are : "+sum);
    }
}
