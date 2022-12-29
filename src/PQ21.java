//Display prime numbers form 1 to N using for loop.

import java.util.Scanner;

public class PQ21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        System.out.print("Prime numbers from "+N+" are these : ");
        for(int i=2; i<=N; i++){
            int p=0;
            for(int j=1; j<=i/2; j++){
                if(i%j==0){
                    p++;
                }
            }
            if(p==1){
                System.out.print(i+" ");
            }
        }
    }
}
