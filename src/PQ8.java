//Display the sum of factorial series up to N.

import java.util.Scanner;

public class PQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
            int fact = 1;
            for(int j=1; j<=i; j++){
                fact *= j;
            }
            sum += fact;
        }
        System.out.println("The sum of factorial series up to "+N+" is "+sum);
    }
}
