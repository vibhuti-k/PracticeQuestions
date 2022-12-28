// First take 2 arrays form user add all the elements of both the arrays in third array and shot it.

import java.util.Scanner;

public class PQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in first array : ");
        int a = sc.nextInt();
        int[] p = new int[a];
        for(int i=0; i<a; i++){
            p[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elements you want in second array : ");
        int b = sc.nextInt();
        int[] q = new int[b];
        for(int j=0; j<b; j++){
            q[j] = sc.nextInt();
        }
        int x = 0;
        int[] r = new int[a+b];
        for(int k=0; k<a; k++){
            r[x] = p[k];
            x++;
        }
        for(int l=0; l<b; l++){
            r[x] = q[l];
            x++;
        }
        for(int i=0; i<=x-2; i++){
            for(int j=0; j<=x-2-i; j++){
                if(r[j]>r[j+1]){
                    int o;
                    o = r[j];
                    r[j]=r[j+1];
                    r[j+1]=o;
                }
            }
        }
        for(int i=0; i<x; i++){
            System.out.print(r[i]+" ");
        }
    }
}
