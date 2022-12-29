//Write a program to find sum of digits of the numbers.

import java.util.Scanner;

public class PQ27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int N = sc.nextInt();
        int p = N;
        int sum = 0;
        while(N!=0){
            sum += N%10;
            N /= 10;
        }
        System.out.print("The sum of digits of "+p+" is this : "+sum);
    }
}
