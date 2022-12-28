//Write a program to check weather the number is armstrong or not.

import java.util.Scanner;

public class PQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int sum = 0;
        int p = a;
        while(a > 0){
            int r = a % 10;
            sum = sum + (r * r * r);
            a = a / 10;
        }
        if(sum == p){
            System.out.println("It is Armstrong.");
        }
        else{
            System.out.println("It is not Armstrong.");
        }
    }
}
