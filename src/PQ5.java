//Write a program to find largest of three numbers.

import java.util.Scanner;

public class PQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is largest.");
        }
        else if(b>a && b>c){
            System.out.print(b+" is largest.");
        }
        else{
            System.out.print(c+" is largest.");
        }
    }
}
