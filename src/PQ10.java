//Print fibonacci series up to a range.

import java.util.Scanner;

public class PQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series up to "+N+" elements are : ");
        System.out.print(a+" "+b);
        for(int i=0; i<N-2; i++){
            int c = a + b;
            System.out.print(" "+c+" ");
            a = b;
            b = c;
        }
    }
}
