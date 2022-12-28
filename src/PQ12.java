//Write a program to check weather the number is palindrome or not.

import java.util.Scanner;

public class PQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int N = sc.nextInt();
        int p = N;
        int s = 0;
        while(N!=0){
            int r = N%10;
            s = s * 10 + r;
            N = N /10;
        }
        if(s == p){
            System.out.println(p+" is palindrome.");
        }
        else{
            System.out.println(p+" is not palindrome.");
        }
    }
}
