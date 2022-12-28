//Write a program to check for even or odd.

import java.util.Scanner;

public class PQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is Odd.");
        }
    }
}
