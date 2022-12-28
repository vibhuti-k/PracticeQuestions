//Write a program to calculate average marks of five subjects.

import java.util.Scanner;

public class PQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"Physics","Chemistry","Maths","English","Computer"};
        float sum = 0;
        for(String i : a){
            System.out.print("Enter the marks of "+i+" : ");
            sum = sum + sc.nextFloat();
        }
        float avg = sum / 5;
        System.out.println("The Average is : "+avg);
    }
}
