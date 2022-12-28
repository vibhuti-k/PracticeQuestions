//Print all natural numbers using while loop up to Nth values.

import java.util.Scanner;

public class PQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        int i = 1;
        System.out.print(N+" natural numbers are this : ");
        while(i <= N){
            System.out.print(i+" ");
            i++;
        }
    }
}
