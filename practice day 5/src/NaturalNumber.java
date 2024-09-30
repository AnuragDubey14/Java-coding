//1. Write a program to print all natural numbers from 1 to n

import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = input.nextInt();
        int num = 0;
        for(;num<n;num++){
            System.out.printf("%d,\n",num);
        }
    }
}
