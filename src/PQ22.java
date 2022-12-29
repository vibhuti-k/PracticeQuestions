//Write a program using for loop to check weather the number is prime or not.

import java.util.Scanner;

public class PQ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int n = sc.nextInt();
        int p=0;
        for(int j=1; j<=n/2; j++){
            if(n%j==0){
                p++;
            }
        }
        if(p==1){
            System.out.print(n+" is Prime.");
        }
        else{
            System.out.print(n+" is not Prime.");
        }
    }
}
