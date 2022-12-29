//1-x+(x^2/2!)-(x^3/3!)+.....+(x^n/n!)

import java.util.Scanner;

public class PQ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        float n = sc.nextFloat();
        System.out.print("Enter the value of x : ");
        float x = sc.nextFloat();
        float sum = 1f;
        float fact = 1f;
        for(int i=1; i<=n; i++){
            fact *= i;
            sum += Math.pow(-1,i)*((Math.pow(x, i))/fact);
        }
        System.out.println(sum);
    }
}
