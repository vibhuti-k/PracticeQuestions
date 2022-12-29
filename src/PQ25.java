//Print all the natural numbers in reverse order up to N.

import java.util.Scanner;

public class PQ25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        System.out.print("The natural numbers in reverse order up to "+N+" are : ");
        for(int i=N; i>0; i--){
            System.out.print(i+" ");
        }
    }
}
