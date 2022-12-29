//Sum of odd and even numbers between 1 to N.

import java.util.Scanner;

public class PQ29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        int odd=0, even=0;
        for(int i=2; i<=N; i+=2){
            even += i;
            odd += (i-1);
        }
        System.out.println("The sum of odd numbers are this : "+odd);
        System.out.println("The sum of even numbers are this : "+even);
    }
}
