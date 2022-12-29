//Print sum of all the natural numbers up to Nth values.

import java.util.Scanner;

public class PQ28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int N = sc.nextInt();
        System.out.print("The sum of natural numbers up to "+N+" is the : "+(N*(N+1))/2);
    }
}
